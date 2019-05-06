
package cn.net.sinodata.util;

import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 配置文件工具类
 * @author Pangpj
 *
 */
public class PropertyUtil {
	private final static Logger logger = LoggerFactory.getLogger(PropertyUtil.class);
	
	/**
	 * 获取指定配置文件中指定属性的值
	 * @param resourcePath 配置文件路径 例如com.ccit.KeyConfig<br>KeyConfig 为配置文件名
	 * @param name 属性
	 * @return 属性值
	 * @throws FileNotFoundException 
	 */
	public static String getValue(String resourcePath, String name){
		ResourceBundle bundle = ResourceBundle.getBundle(resourcePath);
		if (bundle == null) {
			try {
				throw new FileNotFoundException(resourcePath);
			} catch (FileNotFoundException e) {
				logger.error("get configuration value error -resourcePath:{} - error message:", resourcePath, e);
				return null;
			}
		}
		Enumeration<String> enu = bundle.getKeys();
		HashMap<String, String> map = new HashMap<String, String>();
		while (enu.hasMoreElements()) {
			String string = enu.nextElement();
			map.put(string, bundle.getString(string));
		}
		String tempString = map.get(name);
		return tempString;
	}
}