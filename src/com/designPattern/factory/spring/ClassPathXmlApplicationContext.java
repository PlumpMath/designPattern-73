package com.designPattern.factory.spring;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ClassPathXmlApplicationContext implements BeanFactory{
	private Map<String, Object> container = new HashMap<String, Object>();
	
	public ClassPathXmlApplicationContext(String fileName) throws Exception{
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputStream is = null;
		is = this.getClass().getClassLoader().getResourceAsStream(fileName);
		Document doc = db.parse(is);
		
		XPath xpath = XPathFactory.newInstance().newXPath();
		
		NodeList nodeList = (NodeList) xpath.evaluate("/beans/bean", doc, XPathConstants.NODESET);
		
		for(int i=0; i<nodeList.getLength(); i++){
			Element element = (Element) nodeList.item(i);
			String id = element.getAttribute("id");
			String clazz = element.getAttribute("class");
			Object object = Class.forName(clazz).newInstance();
			container.put(id, object);
		}
	}
	
	@Override
	public Object getBean(String id) {
		return container.get(id);
	}

}
