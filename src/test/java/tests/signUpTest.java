package tests;

import org.testng.annotations.Test;


import pages.LoginPage;
import pages.SignUpPage;
import utilities.BaseTest;

public class signUpTest extends BaseTest {
	
	@Test(priority = 1, description = "Verify Sucessfully login")
    public void signUp() {
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signupPage = new SignUpPage(driver);
        loginPage.loginIcons();
        signupPage.createUser();
        signupPage.userName("User1234");
        loginPage.login("user234@example.com", "12345678");
        loginPage.Logout();
        
	}

}
