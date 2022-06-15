package Dropdownss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSingleSelect {

	public DeselectSingleSelect() {
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	 Thread.sleep(4000);
		WebElement dropdownelement = driver.findElement(By.id("//select[@id='first']"));
		Select sel = new Select(dropdownelement);
		sel.selectByVisibleText("Yahoo");
		Thread.sleep(4000);
		sel.deselectByVisibleText("Yahoo");



	}

}
