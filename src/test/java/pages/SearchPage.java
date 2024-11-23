package pages;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;
    

    private By searchIcon = By.xpath("//a[contains(@class,'search-icon')]");
    private By searchInputField = By.xpath("//input[@placeholder='Search']");
    
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnSearchIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
    }

    public void enterSearchItemName(String productName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInputField)).sendKeys(productName + Keys.ENTER);
    }

    public void search(String productName) {
        clickOnSearchIcon();
        enterSearchItemName(productName);
    }

    
    /*public String getSelectedProductText(int productIndex) {
        try {
            By dynamicProductLocator = By.xpath("(//div[contains(@class,'product-name')])[" + productIndex + "]");
            WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicProductLocator));
            
            return product.getText();
        } catch (Exception e) {
            System.out.println("Product at index " + productIndex + " not found. Error: " + e.getMessage());
            return null;
        }
    }*/


}
