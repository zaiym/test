package com.pde.disk.domain;


public class DiskInfo {

    /**
     * 磁盘空闲空间大小KB
     */
    private long free;

    /**
     * 磁盘总空间大小KB
     */
    private long total;

    /**
     * 检测状态 成功:true 失败:false
     */
    private boolean state = true;

    /**
     * 信息
     */
    private String message;

    public long getFree() {
        return free;
    }

    public void setFree(long free) {
        this.free = free;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
