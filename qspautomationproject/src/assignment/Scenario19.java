package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario19 {

	public Scenario19() {
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(4000);
		WebElement targetToMouseHover = 

				driver.findElement(By.xpath("//li[@class='menuparent']"));
				Actions act = new Actions(driver);
				act.moveToElement(targetToMouseHover).perform();
				driver.findElement(By.xpath("//a[text()='Gold Coins']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='5']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//img[@class='hc img-responsive center-block lazyloaded']")).click();
				
				driver.close();
				

	}

}
