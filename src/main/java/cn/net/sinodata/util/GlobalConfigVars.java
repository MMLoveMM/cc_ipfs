package cn.net.sinodata.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import cn.net.sinodata.model.TDataDict;


public class GlobalConfigVars {
	
	private static final Logger logger = Logger.getLogger(GlobalConfigVars.class);
	
	private static final String DataDict_CONFIG_NAME= "DataDictConfig.xml";
	/*private static final String Log_CONFIG_NAME= "log/LogConfig.xml";
	private static final String NODEBACK_CONFIG_NAME= "xml/NodeBack.xml";*/
	
	//数据字典类型信息
	public static List<TDataDict> dataDictTypeinfo = new ArrayList<TDataDict>();
	//节点回退信息
	/*public static List<NodeVO> nodeBackInfo = new ArrayList<NodeVO>();*/
	
	static{
		init();
	}
	
	/**
	 * 
	 *   @生成时间： 2014-12-24 上午9:37:43
	 *   @方法说明： 初始化
	 *   @参数：
	 *   @返回值： 
	 *   @异常：
	 *
	 */
	private static void init(){
		try {
			SAXBuilder builder = new SAXBuilder();
			initDataDictConfig(builder);
			/*initLogConfig(builder);
			initNodeBackConfig(builder);*/
		} catch (JDOMException e) {
			logger.error("|平台|JDOM解析时抛出异常|", e);
		} catch (IOException e) {
			logger.error("|平台|输入输出时抛出异常|", e);
		}
	}
	
	/**
	 * 
	 *   @生成时间： 2017年9月5日13:27:00
	 *   @方法说明： 节点退回信息
	 *   @参数：
	 *   @返回值： 
	 *   @异常：
	 *
	 */
	/*@SuppressWarnings("unchecked")
	private static void initNodeBackConfig(SAXBuilder builder)
			throws JDOMException, IOException {
		Document doc = builder.build( GlobalConfigVars.class
				.getClassLoader().getResourceAsStream(NODEBACK_CONFIG_NAME));
		Element ServiceClasses = doc.getRootElement();
		List<Element> nodes = ServiceClasses.getChildren("node");	
		NodeVO nodeVo ;
		for (Element node : nodes) {
			nodeVo = new NodeVO();
			String type = node.getAttributeValue("type");
			Element codeElement = node.getChild("code");
			Element nameElement = node.getChild("back");
			Element userElement = node.getChild("backOper");
			String code = codeElement.getText();
			String next = nameElement.getText();
			String user = userElement.getText();
			nodeVo.setProcessName(type);
			nodeVo.setCurNode(code);
			nodeVo.setBackNode(next);
			nodeVo.setBackOper(user);
			nodeBackInfo.add(nodeVo);
		}	
	}*/
	
	
	@SuppressWarnings("unchecked")
	private static void initDataDictConfig(SAXBuilder builder)
			throws JDOMException, IOException {
		Document doc = builder.build( GlobalConfigVars.class
				.getClassLoader().getResourceAsStream(DataDict_CONFIG_NAME));
		Element ServiceClasses = doc.getRootElement();
		List<Element> ddtypes = ServiceClasses.getChildren("ddtype");	
		TDataDict dd ;
		for (Element dtype : ddtypes) {
			dd = new TDataDict();
			Element codeElement = dtype.getChild("code");
			Element nameElement = dtype.getChild("name");
			String code = codeElement.getText();
			String name = nameElement.getText();
			dd.setDcode(code);
			dd.setDname(name);
			dataDictTypeinfo.add(dd);
		}	
	}
	
	/**
	 * 
	 *   @生成时间： 2017年9月5日13:26:52
	 *   @方法说明： 读取日志参数信息
	 *   @参数：
	 *   @返回值： 
	 *   @异常：
	 *
	 */
	/*@SuppressWarnings("unchecked")
	private static void initLogConfig(SAXBuilder builder)
			throws JDOMException, IOException {
		Document doc = builder.build( GlobalConfigVars.class
				.getClassLoader().getResourceAsStream(Log_CONFIG_NAME));
		Element ServiceClasses = doc.getRootElement();
		List<Element> ltypes = ServiceClasses.getChildren("ltype");	
		TDataDict dd ;
		for (Element ltype : ltypes) {
			dd = new TDataDict();
			Element codeElement = ltype.getChild("code");
			Element nameElement = ltype.getChild("name");
			String code = codeElement.getText();
			String name = nameElement.getText();
			dd.setDcode(code);
			dd.setDname(name);
			dataDictTypeinfo.add(dd);
		}	
	}*/
	
	/**
	 * 
	 *   @生成时间： 2015-2-27 下午3:39:08
	 *   @方法说明： 参数转译
	 *   @参数：
	 *   @返回值： 
	 *   @异常：
	 *
	 */
	/*@SuppressWarnings({"unchecked"})
	public static Map<String, String> getLogParamConfig(String config)
			throws JDOMException, IOException {
		Map<String,String> paramMap = new HashMap<String, String>();
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build( GlobalConfigVars.class
				.getClassLoader().getResourceAsStream("log/"+config+"Config.xml"));
		Element ServiceClasses = doc.getRootElement();
		List<Element> steps = ServiceClasses.getChildren("Step");
		for (Element step : steps) {
			String name = step.getAttributeValue("Name");
			String description = step.getText();
			paramMap.put(name, description);
		}
		return paramMap;
	}*/
}
