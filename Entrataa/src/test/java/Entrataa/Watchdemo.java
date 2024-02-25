package Entrataa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Watchdemo {
	@Test
public void watchvideo() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.entrata.com");
	        driver.findElement(By.id("rcc-confirm-button")).click();
	        driver.findElement(By.xpath("(//a[@title='Watch Demo Button'][normalize-space()='Watch Demo'])[1]")).click();
	        Thread.sleep(10, 10);
	        
	        driver.quit();
	}
}
