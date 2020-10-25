package com.javagentest.demo.Proxy.runtime;
public class AirMonitorImpl implements AirMonitor {
private double PM2_5;
private String id;
private String locationName;
private String deviceName;
private String status;
private String type;
@Override
public double getPM2_5() {return PM2_5;}
@Override
public void setPM2_5(double PM2_5) {this.PM2_5 = PM2_5;}
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
}