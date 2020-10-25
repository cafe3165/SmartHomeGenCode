package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Wilo;
import com.javagentest.demo.Proxy.runtime.SmartWaterPump;
import com.javagentest.demo.Proxy.runtime.SmartWaterPumpImpl;
import java.util.*;
public class ConfigSmartWaterPump {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Wilo.class.getName(), SmartWaterPumpImpl.class.getName());
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setHumidity", double.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setHumidity", double.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getHumidity").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getHumidity").getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setId", String.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setId", String.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getId").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getId").getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getLName").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getLocationName").getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getStatus").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getStatus").getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getDName").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getDeviceName").getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setType", String.class).getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("setType", String.class).getName()));
    apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getType").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("getType").getName()));
        apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("water").getName(), Collections.singletonList(Wilo.class.getName() + "." + Wilo.class.getMethod("water").getName()));
    }
}