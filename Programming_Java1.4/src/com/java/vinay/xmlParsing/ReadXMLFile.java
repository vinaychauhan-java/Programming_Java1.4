package com.java.vinay.xmlParsing;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLFile {
	public static void main(String argv[]) {
		try {

			//File xmlFile = new File("E:\\MyTestWorkSpace\\Programming_Java1.4\\src\\com\\java\\vinay\\xmlParsing\\databaseConfigurations.xml");
			File xmlFile = new File("src\\com\\java\\vinay\\xmlParsing\\databaseConfigurations.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(xmlFile);

			document.getDocumentElement().normalize();
			System.out.println("Root element : "+ document.getDocumentElement().getNodeName());
			NodeList nodeList = document.getElementsByTagName("environment");
			System.out.println("----------------------------------------------");

			for (int counter = 0; counter < nodeList.getLength(); counter++) {
				Node node = nodeList.item(counter);
				System.out.println("\nCurrent Element :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println("  name : "+ element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("  logicalName : "+ element.getElementsByTagName("logicalName").item(0).getTextContent());
					System.out.println("  connString: "+ element.getElementsByTagName("connString").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
