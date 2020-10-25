package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Panasonic;
import com.javagentest.demo.Proxy.runtime.AirCondition;
import com.javagentest.demo.Proxy.runtime.AirConditionImpl;
import java.util.*;
public class ConfigAirCondition {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Panasonic.class.getName(), AirConditionImpl.class.getName());
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setTemperature", double.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setTemperature", double.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getTemperature").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getTemperature").getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setId", String.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setId", String.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getId").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getId").getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getLName").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getLocationName").getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getStatus").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getStatus").getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getDName").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getDeviceName").getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("setType", String.class).getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("setType", String.class).getName()));
    apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("getType").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("getType").getName()));
        apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("up").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("up").getName()));
        apiMaps.put(AirCondition.class.getName() + "." + AirCondition.class.getMethod("down").getName(), Collections.singletonList(Panasonic.class.getName() + "." + Panasonic.class.getMethod("down").getName()));
    }
}