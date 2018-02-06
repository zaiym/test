package com.pde.disk.server.impl;

import com.pde.disk.domain.DiskInfo;
import com.pde.disk.server.DiskServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Windows平台磁盘大小检测
 */
@Service("WinDiskServer")
public class WinDiskServer implements DiskServer{

    @Value("${win.disk}")
    private String[] disks;

    @Override
    public DiskInfo checkDisk() {
        DiskInfo diskInfo = new DiskInfo();
        try {
            if (disks == null || disks.length <= 0) {
                diskInfo.setState(false);
                diskInfo.setMessage("获取待检测磁盘配置信息【win.disk】异常");
            }
            long free = 0;
            long total = 0;
            for (String disk : disks) {
                File file = new File(disk + ":");
                free += file.getFreeSpace();
                total += file.getTotalSpace();
            }
            diskInfo.setFree(free);
            diskInfo.setTotal(total);
        } catch (Exception e) {
            diskInfo.setFree(0);
            diskInfo.setTotal(0);
            diskInfo.setState(false);
            diskInfo.setMessage(e.getMessage());
        }
        return diskInfo;
    }
}
