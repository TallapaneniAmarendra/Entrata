package Entrataa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class propertymanagment {
	@Test
	public void mamagment(){
			 WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.entrata.com");
		        driver.findElement(By.id("rcc-confirm-button")).click();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//div[@id='gatsby-focus-wrapper']")).click();
		        
		        driver.quit();
	}
}
	
