package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addToCartPage {
	private WebDriver driver;
    private WebDriverWait wait;
    
    private By varient = By.xpath("//ul[contains(@class, 'variant-option-list')]//li");

    private By searchIcon = By.xpath("//a[contains(@class,'search-icon')]");
    private By searchInputField = By.xpath("//input[@placeholder='Search']");
    
    public addToCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void colourVarient(String colour) {
    	Select select = new Select(driver.findElement(varient));
    	select.selectByVisibleText(colour);

    }

}
