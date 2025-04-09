package com.qa.googlesearch.interfaces;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface AF {

	WebElement getElement(By locator);
	List<WebElement> getElements(By locator);
	void doSendKeys(By locator, String value);
	void doClick(By Locator);
	String doGetText(By locator);
	boolean doIsDisplayed(By locator);
	void doActionsSendKeys(By locator, String value);
	void doActionsClick(By locator);
	List<WebElement> waitForVisibilityOfElements(By locator, int timeOut);
	WebElement doPresenceOfElementLocated(By locator, int timeOut);
	WebElement doPresenceOfElementLocated(By locator, int timeOut, int intervalTime);
	WebElement doVisibilityOfElement(By locator, int timeOut);
	boolean waitForURL(String urlFraction, int timeOut);
	boolean waitForURLToBe(String urlValue, int timeOut);
	boolean waitForTitle(String titleFraction, int timeOut);
	boolean waitForTitleIs(String titleVal, int timeOut);
	String getPageTitle(String loginPageTitle, int defaultTimeOut);
	
}
