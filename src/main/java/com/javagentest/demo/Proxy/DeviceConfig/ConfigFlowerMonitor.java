package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Meacon;
import com.javagentest.demo.Proxy.runtime.FlowerMonitor;
import com.javagentest.demo.Proxy.runtime.FlowerMonitorImpl;
import java.util.*;
public class ConfigFlowerMonitor {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Meacon.class.getName(), FlowerMonitorImpl.class.getName());
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setHumidity", double.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setHumidity", double.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getHumidity").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getHumidity").getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setId", String.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setId", String.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getId").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getId").getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getLName").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getLocationName").getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getStatus").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getStatus").getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getDName").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getDeviceName").getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setType", String.class).getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("setType", String.class).getName()));
    apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getType").getName(), Collections.singletonList(Meacon.class.getName() + "." + Meacon.class.getMethod("getType").getName()));
    }
}