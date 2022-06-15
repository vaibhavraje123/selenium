package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public TagNameLocator() {
	}

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https:www.facebook.com/");
   driver.findElement(By.tagName("input")).sendKeys("admin");
   
	}
	
	
	
	
	

}
