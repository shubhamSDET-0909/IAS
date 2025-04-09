package com.qa.googlesearch.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author :Shubham Bhutkar
 */
public class DriverFactory {

	public WebDriver driver;
	public Properties prop;
	/**
	 *  * This Method will return the driver
	 * @param browser
	 * @return driver
	 */
	
	public WebDriver init_driver(Properties prop) {
		
		String browser = prop.getProperty("browser").trim();
		System.out.println("Browser name is::"+browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Please pass correct browser");
		}
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		return driver;
	}
	
	/**
	 * This Method used for Initalizing the Property
	 * 
	 */
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./src/test/resource/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
}
