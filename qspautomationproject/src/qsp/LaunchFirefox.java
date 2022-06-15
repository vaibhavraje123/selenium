package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/firefoxdriver.exe");
		new FirefoxDriver();
	}

}
