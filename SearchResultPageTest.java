package com.qa.googlesearch.tests;

import org.testng.annotations.Test;

public class SearchResultPageTest extends BaseTest {

	
	@Test
	public void searchTextInputFieldTest() {
		searchPage.enterSearchText("tree");
		searchResultsPage.getAllLinksImagesAfterSearch();
	}
	
	@Test
	public void searchSepcialCharactersInputFieldTest() {
		searchPage.enterSearchText("^%$#$^*&^");
		searchResultsPage.getAllLinksImagesAfterSearch();
	}
	
	@Test
	public void paginationNextButtonTest() {
		paginationPage.goToNextPage();
	}
	
	@Test
	public void paginationPreviousButtonTest() {
		paginationPage.goToPrevPage();
	}
}
