package methodsofwindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public GetPageSource() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=ross+geller&sxsrf=ALiCzsbxoccfdqhGqwbcJpV9cI63VL8YKQ%3A1651986030634&ei=bk53YtuzJs2fseMP_N-Y8As&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYBjINCC4QxwEQ0QMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzoHCAAQRxCwAzoHCAAQsAMQQzoMCC4QyAMQsAMQQxgBOg8ILhDUAhDIAxCwAxBDGAE6CgguEMcBENEDECc6EAgAEIAEEIcCELEDEIMBEBQ6BAgAEEM6CAgAEIAEELEDOgoIABCxAxCDARBDOgcIABCxAxBDOgsIABCABBCxAxCDAToECCMQJ0oECEEYAEoECEYYAVCiDVj8EWDGUGgCcAF4AYABswGIAc0FkgEDMC41mAEAoAEBsAEKyAETwAEB2gEGCAEQARgI&sclient=gws-wiz");
		String sourceCodeofTheWebPage = driver.getPageSource();
		System.out.println("get the source code of webpage");
		
		

		
		
		

	}

}
