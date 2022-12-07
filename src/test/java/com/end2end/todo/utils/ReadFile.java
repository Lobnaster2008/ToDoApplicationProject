package com.end2end.todo.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.xml.sax.InputSource;

public class ReadFile {

	private final String pathLocal = "src/test/resources/congis/local.properties";
	private final String pathStagging ="src/test/resources/congis/stagging.properties"	;
	private final String pathAcceptance = "src/test/resources/congis/acceptance.properties";
	private final String pathproduction = "src/test/resources/congis/production.properties";
	
	
	Properties properties;
	public ReadFile(String path ) throws IOException {
		BufferedReader reader;
		reader = new BufferedReader( new FileReader(path));
		Properties properties = new Properties();
		properties.load(reader);
		reader.close();
	// TODO Auto-generated constructor stub
	}
	/*  Allow to identify the path of config file containing Data  */
	public String getFilePath(String domain) {
		String path ;
		if(domain == "local")
			path=  properties.getProperty(pathLocal);
		else if (domain == "production")
			path=  properties.getProperty(pathproduction);
		else if (domain == "stagging")
			path = properties.getProperty(pathStagging);
		else if (domain =="acceptance")
			path = properties.getProperty(pathAcceptance);
		else
			path=  properties.getProperty(pathLocal);
		return path;
	}
	/*   Allow to return the content of the file  */
		public String getProperties	(String prop) {	
			return properties.getProperty(prop) ;
		}
}
