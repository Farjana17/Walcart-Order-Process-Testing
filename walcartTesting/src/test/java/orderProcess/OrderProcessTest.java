package orderProcess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderProcessTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium with Java\\Walcart\\walcartTesting\\Drivers\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.walcart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		driver.findElement(By.xpath("//span[@class='main-photo']//span[@class='product-image-container product-image-container-88032']//img[@alt='iPhone 13 256GB']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Select dropdown = new Select(driver.findElement(By.id("attribute93")));  
	    dropdown.selectByValue("7859");
	    driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
	}

}
