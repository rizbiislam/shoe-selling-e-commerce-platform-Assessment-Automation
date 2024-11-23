package tests;

import org.testng.annotations.Test;

import pages.SearchPage;
import pages.SortAndSelectRandomProduct;
import utilities.BaseTest;

public class SelectAndSortTest extends BaseTest {

	@Test(priority = 1, description = "Verify Sucessfully search")
    public void Search() {
        SearchPage searchPage = new SearchPage(driver);
        SortAndSelectRandomProduct selectAndSortPage = new SortAndSelectRandomProduct(driver);
        searchPage.search("Nike");
        
        selectAndSortPage.sortBy("Price");
        selectAndSortPage.addItemsToCart(2);
        //searchPage.getSelectedProductText(0);
        //searchPage.search("Nike revolution 5");
        
	}
}
