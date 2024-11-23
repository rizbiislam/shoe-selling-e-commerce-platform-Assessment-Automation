package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	
	private WebDriver driver;
    private WebDriverWait wait;
    
    private By userfullName = By.xpath("//input[@name='full_name']");
    private By  createNewAccount = By.xpath("//a[contains(text(),'Create an account')]");
    

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void userName(String fullname) {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(userfullName)).sendKeys(fullname);
        
    }
    

    public void createUser() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(createNewAccount)).click();
        
    }

}
