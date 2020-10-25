package com.javagentest.demo.Proxy.DeviceConfig;
import com.javagentest.demo.Proxy.device.Opple;
import com.javagentest.demo.Proxy.runtime.Light;
import com.javagentest.demo.Proxy.runtime.LightImpl;
import java.util.*;
public class ConfigLight {
public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {
    classMaps.put(Opple.class.getName(), LightImpl.class.getName());
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setBrightness", double.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setBrightness", double.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getBrightness").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getBrightness").getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setId", String.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setId", String.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getId").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getId").getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setLName", String.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setLocationName", String.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getLName").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getLocationName").getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setStatus", String.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setStatus", String.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getStatus").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getStatus").getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setDName", String.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setDeviceName", String.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getDName").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getDeviceName").getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("setType", String.class).getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("setType", String.class).getName()));
    apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("getType").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("getType").getName()));
        apiMaps.put(Light.class.getName() + "." + Light.class.getMethod("RaiseBrightness").getName(), Collections.singletonList(Opple.class.getName() + "." + Opple.class.getMethod("RaiseBrightness").getName()));
    }
}