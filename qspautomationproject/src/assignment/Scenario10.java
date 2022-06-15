package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {

	public Scenario10() {
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click(); 
		Thread.sleep(3000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='chat-widgetrehbdhewb']"));
		driver.switchTo().frame(frameElement);
		WebElement chatWithOurExperts = driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
		chatWithOurExperts.click();
	}

}
