package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public Scenario4() {
		

	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		Thread.sleep(4000);
   driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watches");
   driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    List<WebElement> watchlist = driver.findElements(By.xpath("//h3[@class='s-item_title']"));
    for (int i=0;i<watchlist.size();i++)
    {
    	WebElement productlist = watchlist.get(i);
    	 String prodtext = productlist.getText();
    	System.out.println(prodtext);
    	
    }
    System.out.println("-------------------------");
    for(int k=15;k<=15;k++)
    {
    	WebElement product = watchlist.get(k);
    	String prodtext = product.getText();
    	System.out.println("15 th product is "+prodtext);
    	

    	
    	
    }
   
  
   
  
  
  

  
  
	}

}
