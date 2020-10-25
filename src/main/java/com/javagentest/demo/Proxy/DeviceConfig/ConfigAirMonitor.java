package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Philips;
import com.javagentest.demo.Proxy.runtime.AirMonitor;
import com.javagentest.demo.Proxy.runtime.AirMonitorImpl;
import java.util.*;
public class ConfigAirMonitor {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Philips.class.getName(), AirMonitorImpl.class.getName());
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setPM2_5", double.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setPM2_5", double.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getPM2_5").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getPM2_5").getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setId", String.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setId", String.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getId").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getId").getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getLName").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getLocationName").getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getStatus").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getStatus").getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getDName").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getDeviceName").getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("setType", String.class).getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("setType", String.class).getName()));
    apiMaps.put(AirMonitor.class.getName() + "." + AirMonitor.class.getMethod("getType").getName(), Collections.singletonList(Philips.class.getName() + "." + Philips.class.getMethod("getType").getName()));
    }
}