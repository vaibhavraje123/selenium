package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public Scenario5() {
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
				driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		Thread.sleep(4000);
//driver.findElement(By.xpath("//span[text()='Price']"));
		
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(targetToMouseHover).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Price High to Low ']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
