package cn.net.sinodata.util;

import java.util.ArrayList;
import java.util.List;


/**
 * String 工具类
 * @author Pangpj
 *
 */
public class StringUtil {
	
	/**
	 * 字符串左边补零
	 * @param oriStr 原始字符串
	 * @param length 字符串总长度
	 * @return
	 */
	public static String leftZero (String oriStr, int length) {
		if (oriStr == null) {
			return null;
		}
		StringBuffer temp = new StringBuffer();
		int zeroLength = length - oriStr.length();
		for (int i = 0; i < zeroLength; i++) {
			temp.append("0");
		}
		temp.append(oriStr);
		return temp.toString();
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty (String str) {
		return str == null || "".equals(str.trim());
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty (String str) {
		return str != null && !"".equals(str.trim());
	}
	
	/**
	 * null 转 ''
	 * @param str
	 * @return
	 */
	public static String null2Empty(String str) {
		return str == null ? "" : str.trim();
	}
	
	/**
	 * 将字符串根据指定分隔符转为list
	 * @param str
	 * @param seperater
	 * @return
	 */
	public static List<String> getList(String str, String seperater) {
		List<String> list = new ArrayList<String>();
		String[] arr = str.split(seperater);
		for (String s : arr) {
			list.add(s);
		}
		return list;
	}
	
}
