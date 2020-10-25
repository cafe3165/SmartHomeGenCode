package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Mi;
import com.javagentest.demo.Proxy.runtime.AirCleaner;
import com.javagentest.demo.Proxy.runtime.AirCleanerImpl;
import java.util.*;
public class ConfigAirCleaner {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Mi.class.getName(), AirCleanerImpl.class.getName());
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setPM2_5", double.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setPM2_5", double.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getPM2_5").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getPM2_5").getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setId", String.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setId", String.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getId").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getId").getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getLName").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getLocationName").getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getStatus").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getStatus").getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getDName").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getDeviceName").getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setType", String.class).getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("setType", String.class).getName()));
    apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getType").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("getType").getName()));
        apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("purify").getName(), Collections.singletonList(Mi.class.getName() + "." + Mi.class.getMethod("purify").getName()));
    }
}