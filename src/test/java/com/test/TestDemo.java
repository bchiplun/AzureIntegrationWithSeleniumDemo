package com.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.Base;

public class TestDemo extends Base {
	//WebDriver driver;
	@Test
	public void TestConfigTest()
	{
		System.out.println(c.getBrowser());
		launchBrowser();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
