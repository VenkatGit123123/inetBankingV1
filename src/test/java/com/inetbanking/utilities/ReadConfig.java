package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	/**
	 This is a Utility file, this file will read the data from config.properties file and
	 provide the same data to the BaseClass. 
	 it is a mediator class between config.properties file and BaseClass
	 it is almost equal to page object class
	 */

	//object
	Properties pro;
	
	//constructor
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	/**
	 Whenever new values are added in config.properties file then 
	 we need to create the new method like below and call that method into BaseClass 
	 
	 */
	
	//methods
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	
	/** Commented below browser driver methods because i am not using these methods because i am using WebdriverManager
	   to call driver objects driver **/
	
/**	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
	
	**/

	
}




