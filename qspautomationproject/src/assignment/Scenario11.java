package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public Scenario11() {
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
		driver.findElement(By.xpath("//span[ text()='10% Making Charges Off on Plain Gold Jewellery']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
