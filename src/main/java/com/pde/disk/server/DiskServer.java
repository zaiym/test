package com.pde.disk.server;


import com.pde.disk.domain.DiskInfo;

public interface DiskServer {

    /**
     * 检测磁盘空间
     * @return 磁盘剩余空间及总空间
     */
    DiskInfo checkDisk();

}
