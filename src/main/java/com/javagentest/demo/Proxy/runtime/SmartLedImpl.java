package com.javagentest.demo.Proxy.runtime;
public class SmartLedImpl implements SmartLed {
private double Brightness;
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
@Override
public double getBrightness() {return Brightness;}
@Override
public void setBrightness(double Brightness) {this.Brightness = Brightness;}
@Override
public String getId() {return id;}
@Override
public void setId(String id) {this.id = id;}
@Override
public String getLName() {return locationName;}
@Override
public void setLName(String locationName) {this.locationName = locationName;}
@Override
public String getDName() {return deviceName;}
@Override
public void setDName(String deviceName) {this.deviceName = deviceName;}
@Override
public String getStatus() {return status;}
@Override
public void setStatus(String status) {this.status = status;}
@Override
public String getType() {return type;}
@Override
public void setType(String type) {this.type = type;}
@Override
public void illumine() {}
}