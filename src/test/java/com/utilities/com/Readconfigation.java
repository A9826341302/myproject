package com.utilities.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfigation {
	
	Properties pro; 
	String path="C:\\Users\\Admin\\eclipse-workspace\\DataDrivenFramework\\configuration\\datafiles.properties"; 
	 public Readconfigation ()  { 
	pro=new Properties(); 
	FileInputStream fn=null;
	 try{
		 fn=new FileInputStream(path); 
	 }catch(FileNotFoundException e) {
		 e.printStackTrace();
	 }
	 try {
		 
	pro.load(fn); 
	} 
	 catch(IOException e) {
		 e.printStackTrace();
		 }
	}
	public String getUrl() 
	{ 
	String s1=pro.getProperty("url"); 
	if(s1!=null) 
	{ 
	return s1; 
	} 
	else 
	{ 
	throw new RuntimeException("url not found"); 
	} 
	} 
	
	public String getBrowser() {
		// TODO Auto-generated method stub
		String s1=pro.getProperty("browser"); 
		if(s1!=null) 
		{ 
		return s1; 
		} 
		else 
		{ 
		throw new RuntimeException("browser not found"); 
		} 
		}

}
