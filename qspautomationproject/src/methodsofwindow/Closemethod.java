package methodsofwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closemethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/suraj743/wcsm7");
	driver.findElement(By.linkText("Open a popup window")).click();
	Thread.sleep(4000);
	driver.close();
	

	}

}
