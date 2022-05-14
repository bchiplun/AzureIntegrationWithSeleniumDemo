package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.google.gson.Gson;
import com.pojo.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public BaseConfig c;
	public WebDriver driver;
	
	@BeforeSuite
	public void getConfig() throws FileNotFoundException
	{
		Gson g = new Gson();
		Reader r = new FileReader(System.getProperty("user.dir")+"\\TestConfig.json");
		c = g.fromJson(r, BaseConfig.class);
	}
	
	
	public void launchBrowser()
	{
		
		if(c.getBrowser().equalsIgnoreCase("chrome"))
		{
			driver =  WebDriverManager.chromedriver().create();
		}
		if(c.getBrowser().equalsIgnoreCase("edge"))
		{
			driver =  WebDriverManager.edgedriver().create();
		}
		
	}
	
	
	
	 
}
