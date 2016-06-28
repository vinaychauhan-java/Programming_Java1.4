package com.java.vinay.xmlParsing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeDOMParser {

	public static void main(String[] args) throws Exception {
		// Create DOM Builder Factory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// Create DOM Builder
		DocumentBuilder builder = factory.newDocumentBuilder();
		// Load and Parse the XML document
		// Document document = builder.parse(ClassLoader.getSystemResourceAsStream("employeeData.xml"));
		Document document = builder.parse("src\\com\\java\\vinay\\xmlParsing\\employeeData.xml");
		// Iterating through the nodes and extracting the data.
		NodeList nodeList = document.getDocumentElement().getChildNodes();
		List<StringBuilder> xmlStringList= new ArrayList<StringBuilder>();
		StringBuilder xmlStringValue =null;
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			xmlStringValue = new StringBuilder();
			if (node instanceof Element) {
				NodeList childNodes = node.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					Node cNode = childNodes.item(j);
					if (cNode instanceof Element) {
						//System.out.println(cNode.getNodeName() + " :: "+ cNode.getLastChild().getTextContent());
						xmlStringValue.append(cNode.getNodeName());
						xmlStringValue.append("#"); // Delimiter between a key and value pair
						xmlStringValue.append(cNode.getLastChild().getTextContent());
						if (j < (childNodes.getLength()-2)){
							xmlStringValue.append("##"); // Delimiter between keys
						}
					}
				}
				xmlStringList.add(xmlStringValue);
			}
		}
		
		System.out.println(xmlStringList);
		for (StringBuilder xmlString : xmlStringList){
			splitXmlString(xmlString.toString(),"##");
			System.out.println("\n**********************");
		}
	}
	
	private static void splitXmlString(String xmlString, String delimiter){
	      for (String retValue: xmlString.split(delimiter)){
	         //System.out.println(retValue);
	         System.out.print(retValue.split("#")[0]);
	         System.out.print(" :: ");
	         System.out.println(retValue.split("#")[1]);
	      }
	}
}
