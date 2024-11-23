package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class checkoutPage {
	private WebDriver driver;
    private WebDriverWait wait;
    
    
    private By productPrice = By.xpath("//td//span[@class='sale-price']");
    private By productQuantity = By.xpath("//input[@type='text']");
    private By Carts = By.xpath("//a[@class='mini-cart-icon' and @href='/cart']");
    private By subTotal = By.xpath("//div[contains(text(),'Sub total')]/following-sibling::div");
    private By grandTotal = By.xpath("//div[@class='grand-total-value']");
    private By checkoutButton = By.xpath("//a[contains(@href, '/checkout')]");
    

    public checkoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void cartButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(Carts)).click();
    }
    
    public void checkPrice() {
    	String subtotal = wait.until(ExpectedConditions.elementToBeClickable(subTotal)).getText();
    	String sub = subtotal.replace("$", "").replace(",", "");
    	int actualPrice = Integer.parseInt(sub);
    
    	String grandtotal = wait.until(ExpectedConditions.elementToBeClickable(grandTotal)).getText();
    	String grand = grandtotal.replace("$", "").replace(",", "");
    	int expectedPrice = Integer.parseInt(grand);
    	
    	Assert.assertEquals(actualPrice, expectedPrice, "Product price does not match!");
    	}
    
    
    public void checkout() {
    	wait.until(ExpectedConditions.elementToBeClickable(grandTotal)).click();
	}
}
