package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public IdLocator() {
	}

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https:www.facebook.com/");
   driver.findElement(By.id("email")).sendKeys("admi");
   Thread.sleep(4000);
   driver.findElement(By.id("pass")).sendKeys("admi");

	}

}
