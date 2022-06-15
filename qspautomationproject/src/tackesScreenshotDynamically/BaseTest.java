package tackesScreenshotDynamically;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	static WebDriver driver;
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}

}
