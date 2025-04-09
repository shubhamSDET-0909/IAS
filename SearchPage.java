package com.qa.googlesearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.googlesearch.utils.Constants;
import com.qa.googlesearch.utils.ElementUtil;

public class SearchPage {

	private WebDriver driver;
	private ElementUtil elementUtil;

	// Locators:
	private By searchBoxInput = By.xpath("//textarea[@name='q' and @title='Search']");
	private By searchBoxButton = By.xpath("//input[@value='Google Search']");
	private By searchNextPage = By.cssSelector("#pnnext");
	private By searchPreviousPage = By.cssSelector("#pnprev");

	// Consturctor
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	// Actions
	public void enterSearchText(String text) {
		elementUtil.doSendKeys(searchBoxInput, text);
		elementUtil.doVisibilityOfElement(searchBoxButton, Constants.DEFAULT_TIME_OUT);
		elementUtil.doClick(searchBoxButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
}
