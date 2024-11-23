package tests;

import org.openqa.selenium.WebDriver;
import utilities.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.SortAndSelectRandomProduct;
import pages.addToCartPage;

public class AddToCartTest extends BaseTest{


	@Test(priority = 5, description = "Verify Sucessfully Add to Cart")
    public void testAddProductToCart() {
		
        addToCartPage addtocart = new addToCartPage(driver);
        SortAndSelectRandomProduct selectAndSortPage = new SortAndSelectRandomProduct(driver);
		SearchPage searchPage = new SearchPage(driver);
		
        searchPage.clickOnSearchIcon();
        searchPage.enterSearchItemName("Nike revolution 5");
        selectAndSortPage.addItemsToCart(0);
        addtocart.colourVarient("Brown");
    	

        /*addToCart = new AddToCart(driver);

        addToCart.clickOnProductFromList("Nike revolution 5"); 
        addToCart.selectProductSize(1);
        addToCart.selectColor();
        addToCart.enterProductQty("2");
        addToCart.clickOnAddToCartButton();
        addToCart.clickOnViewCartButton();
        
        double expectedPrice = 510;
        double actualPrice = addToCart.getSingleProductPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Product price does not match!");*/
    }

}
