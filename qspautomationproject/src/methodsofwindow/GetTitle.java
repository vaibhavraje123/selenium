package methodsofwindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public GetTitle() {
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String titleOfLoginPage = driver.getTitle();
		System.out.println(titleOfLoginPage);
	}
		

	}


