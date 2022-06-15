package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public Scenario12() {
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click(); 
		Thread.sleep(3000);
		WebElement targetToMouseHover = 

		driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[ text()='Flat 15% off on MRP']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
