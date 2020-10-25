package com.javagentest.demo.util.device;

public class Mi {

    private double PM2_5;
    private String type;
    private String id;
    private String locationName;
    private String deviceName;
    private String status;

    public String getLocation() {
        return locationName;
    }

    public void setLocation(String location) {
        this.locationName = location;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void purify() {
        PM2_5 -= 0.1;
        System.out.println("Mi" + "开始进行" + "purify操作.");
    }

    public double getPM2_5() {
        return PM2_5;
    }

    public void setPM2_5(double t) {
        PM2_5 = t;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}