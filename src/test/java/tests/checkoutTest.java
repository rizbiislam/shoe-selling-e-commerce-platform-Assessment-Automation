package tests;

import org.testng.annotations.Test;


import pages.LoginPage;
import pages.checkoutPage;
import utilities.BaseTest;

public class checkoutTest extends BaseTest {

	@Test(priority = 1, description = "Verify Sucessfully Checkout")
    public void checkout() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIcons();
        loginPage.login("user1234@example.com", "12345678");
        checkoutPage checkoutPage = new checkoutPage(driver);
        checkoutPage.cartButton();
        checkoutPage.checkPrice();
        
	}

}
