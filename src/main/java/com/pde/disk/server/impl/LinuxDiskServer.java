package com.pde.disk.server.impl;

import com.pde.disk.domain.DiskInfo;
import com.pde.disk.server.DiskServer;
import org.springframework.stereotype.Service;

/**
 * Linux平台磁盘大小检测
 */
@Service(value = "LinuxDiskServer")
public class LinuxDiskServer implements DiskServer{

    @Override
    public DiskInfo checkDisk() {
        return null;
    }
}
