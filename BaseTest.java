package com.qa.googlesearch.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.googlesearch.factory.DriverFactory;
import com.qa.googlesearch.pages.PaginationPage;
import com.qa.googlesearch.pages.SearchPage;
import com.qa.googlesearch.pages.SearchResultsPage;

public class BaseTest {
	
	public DriverFactory df ;
	public Properties prop;
	public SearchPage searchPage;
	public SearchResultsPage searchResultsPage;
	public PaginationPage paginationPage;
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver=	df.init_driver(prop);
		
		searchPage = new SearchPage(driver);
		searchResultsPage = new SearchResultsPage(driver);
		paginationPage = new PaginationPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
