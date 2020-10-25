package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Led;
import com.javagentest.demo.Proxy.runtime.SmartLed;
import com.javagentest.demo.Proxy.runtime.SmartLedImpl;
import java.util.*;
public class ConfigSmartLed {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Led.class.getName(), SmartLedImpl.class.getName());
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setBrightness", double.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setBrightness", double.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getBrightness").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getBrightness").getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setId", String.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setId", String.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getId").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getId").getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getLName").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getLocationName").getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getStatus").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getStatus").getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getDName").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getDeviceName").getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setType", String.class).getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("setType", String.class).getName()));
    apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getType").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("getType").getName()));
        apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("draken").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("draken").getName()));
        apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("lightUp").getName(), Collections.singletonList(Led.class.getName() + "." + Led.class.getMethod("lightUp").getName()));
    }
}