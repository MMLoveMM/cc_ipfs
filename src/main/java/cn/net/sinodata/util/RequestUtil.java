package cn.net.sinodata.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.servlet.http.HttpServletRequest;

public class RequestUtil
{
  public static Map<String, String> getParamMap(Map<String, String[]> reqMap)
  {
    if (reqMap == null) {
      return null;
    }
    Map ret = new HashMap();
    for (Map.Entry entry : reqMap.entrySet()) {
      String[] value = (String[])entry.getValue();
      ret.put(entry.getKey(), (value != null) && (value.length > 0) ? value[(value.length - 1)] : null);
    }

    return ret;
  }

  public static String getIp(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getHeader("PRoxy-Client-IP");
    }
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getRemoteAddr();
    }
    String[] ipStr = ip.split(",");
    if (ipStr.length > 1) {
      ip = ipStr[0];
    }
    return ip;
  }

  public static Map<String, String> getParamTreeMap(Map<String, String[]> reqMap)
  {
    if (reqMap == null) {
      return null;
    }
    Map ret = new TreeMap();
    for (Map.Entry entry : reqMap.entrySet()) {
      String[] value = (String[])entry.getValue();
      ret.put(entry.getKey(), (value != null) && (value.length > 0) ? value[(value.length - 1)] : null);
    }

    return ret;
  }
}