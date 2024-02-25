package Entrataa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.annotations.Test;

public class HomePage {
	@Test
	public void navigateToHomePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.entrata.com");
        String pageTitle = driver.getTitle();
        System.out.println("pagetitle is entrata");
	
        driver.close();
        
	}

		
}
