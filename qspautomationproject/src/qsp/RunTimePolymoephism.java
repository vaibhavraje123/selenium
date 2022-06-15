package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTimePolymoephism {

	public static void main(String[] args) {
	WebDriver driver;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter valid browser which you want open");
	String browserValue=sc.nextLine();
	if(browserValue.equalsIgnoreCase("chrome")) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https//www.instagram.com");
		
		
		
	}
		
		
	}

}
