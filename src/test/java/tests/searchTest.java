package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import utilities.BaseTest;


public class searchTest extends BaseTest{
	
	@Test(priority = 1, description = "Verify Sucessfully search")
    public void Search() {
        SearchPage searchPage = new SearchPage(driver);
        
        searchPage.search("Nike");
        //searchPage.sortBy("Price");
        //searchPage.addItemsToCart(2);
        //searchPage.getSelectedProductText(0);
        //searchPage.search("Nike revolution 5");
        
	}

}
