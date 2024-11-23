package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    
    private By loginIcon = By.xpath("//a[contains(@href,'/account')]");
    private By loginIcon2 = By.xpath("//a[@href='/account']");
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By SigninButton = By.xpath("//button[@type='submit']");
    private By logoutButton = By.xpath("//a[contains(text(),'Logout')]");
    

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void loginIcons() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(loginIcon)).click();
    }

    public void login(String username, String password) {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(username);
    	wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);
    	
        wait.until(ExpectedConditions.elementToBeClickable(SigninButton)).click();
        
    }
    
    
    public void Logout() {
    	loginIcons();
        //wait.until(ExpectedConditions.elementToBeClickable(loginIcon2)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();

    }
}
