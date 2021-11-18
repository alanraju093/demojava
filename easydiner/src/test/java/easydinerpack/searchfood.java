package easydinerpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class searchfood {
public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.eazydiner.com/delhi-ncr?loc=connaught-place-central-delhi");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"home-search\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"home-search\"]")).sendKeys("Biriyani");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"apxor_search\"]/span[2]")).click();
	
		
		
		
		
}
}
