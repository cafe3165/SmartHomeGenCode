package com.javagentest.demo.util.device;

public class Midea {

    private double Brightness;
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

    public void illumine() {
        Brightness += 0.1;
        System.out.println("设备：" + id + " 开始进行" + "RaiseBrightness" + "操作.");
    }

    public double getBrightness() {
        return Brightness;
    }

    public void setBrightness(double t) {
        Brightness = t;
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