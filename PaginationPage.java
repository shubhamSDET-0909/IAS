package com.qa.googlesearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.googlesearch.utils.Constants;
import com.qa.googlesearch.utils.ElementUtil;

public class PaginationPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By searchNextPage = By.cssSelector("#pnnext");
	private By searchPreviousPage = By.cssSelector("#pnprev");

	// Consturctor
	public PaginationPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}

	
	public void goToNextPage() {
		elementUtil.doVisibilityOfElement(searchNextPage, Constants.DEFAULT_TIME_OUT);
		elementUtil.doClick(searchNextPage);
	}

	public void goToPrevPage() {
		elementUtil.doVisibilityOfElement(searchPreviousPage, Constants.DEFAULT_TIME_OUT);
		elementUtil.doClick(searchPreviousPage);
	}
	
}
