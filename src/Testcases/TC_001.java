package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Testcases.Parallel_Testing_Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class TC_001 extends Parallel_Testing_Framework {

	
	
	@Test

	  public void login() {
		 
		 		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	    driver.findElement(By.id("log")).sendKeys("testuser_1");
	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	 
	    driver.findElement(By.id("login")).click();
	 
		}  
}
