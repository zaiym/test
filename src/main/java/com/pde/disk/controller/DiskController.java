package com.pde.disk.controller;

import com.pde.disk.domain.DiskInfo;
import com.pde.disk.server.DiskServer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DiskController {

    @Resource(name = "WinDiskServer")
    private DiskServer winServer;

    @Resource(name = "LinuxDiskServer")
    private DiskServer linuxServer;

    @RequestMapping(value = "getInfo",method = {RequestMethod.GET,RequestMethod.POST})
    public DiskInfo getDiskInfo(){
        String osname = System.getProperty("os.name").toLowerCase();
        if (osname.startsWith("win")) {
            return winServer.checkDisk();
        } else {
            return linuxServer.checkDisk();
        }
    }

}