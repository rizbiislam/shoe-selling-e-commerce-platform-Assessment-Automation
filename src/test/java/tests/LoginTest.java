package tests;

import org.testng.annotations.Test;


import pages.LoginPage;
import utilities.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority = 1, description = "Verify Sucessfully login")
    public void Login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIcons();
        loginPage.login("user1234@example.com", "12345678");
        loginPage.Logout();
        
	}
}
