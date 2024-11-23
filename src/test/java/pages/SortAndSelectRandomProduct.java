package pages;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortAndSelectRandomProduct {


    private WebDriver driver;
    
    private WebDriverWait wait;

    private By allItemsCart = By.xpath("//div[@class='listing-tem']");
    private By sortBys = By.xpath("//select[@class='form-field']");
    private By itemNames = By.xpath(".//div[contains(@class, 'product-name') and contains(@class, 'product-list-name')]/a/span");

    public SortAndSelectRandomProduct(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void sortBy(String sortItem) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(sortBys));
        dropdown.sendKeys(sortItem);
    }
    
    public void addItemsToCart(int shuffledItemIndex) {
        List<WebElement> items = driver.findElements(allItemsCart);
        Collections.shuffle(items);
        
        if (shuffledItemIndex < items.size()) {
            WebElement selectedProduct = items.get(shuffledItemIndex);
            
            String itemName = selectedProduct.findElement(itemNames).getText();
            System.out.println("Adding item to cart: " + itemName);
            selectedProduct.click();
        } else {
            System.out.println("Index out of bounds for the product list.");
        }
    }
}
