package com.javagentest.demo.util.device;

public class Panasonic {

    private double Temperature;
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

    public void up() {
        Temperature -= 0.1;
        System.out.println("Panasonic" + "开始进行" + "up操作.");
        System.out.println("当前温度为"+Temperature);

    }

    public void down() {
        Temperature += 0.1;
        System.out.println("设备：" + id + " 开始进行" + "down" + "操作.");
        System.out.println("当前温度为"+Temperature);

    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double t) {
        Temperature = t;
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