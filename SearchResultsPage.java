package com.qa.googlesearch.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.googlesearch.utils.Constants;
import com.qa.googlesearch.utils.ElementUtil;

public class SearchResultsPage {

	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	//Locators:
	private By searchResultsLinks= By.xpath("//a");
	private By searchResultsImages = By.xpath("//img");
	
	
	
	//Consturctor
	public SearchResultsPage(WebDriver driver){
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	
	public void getAllLinksImagesAfterSearch() {
		//elementUtil.waitForVisibilityOfElements(searchResultsLinks, Constants.DEFAULT_TIME_OUT);
		List<WebElement> linksList = elementUtil.getElements(searchResultsLinks);
		linksList.addAll(elementUtil.getElements(searchResultsImages));
		
		List<WebElement> activelinksList = new ArrayList<WebElement>();
		
		//execulding all images and links which dont have href attribute
		for (int i=0; i<linksList.size(); i++) {
			if(linksList.get(i).getAttribute("href") != null) {
				activelinksList.add(linksList.get(i));
			}
		}
		
		System.out.println("size of active links list ==>" + activelinksList.size());
	}
}
