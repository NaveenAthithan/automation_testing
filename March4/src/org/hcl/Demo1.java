package org.hcl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\March4\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get(" https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.id("sign-in-icon-down"));
	 findElement.click();
	 WebElement findElement2 = driver.findElement(By.id("signInLink"));
	 findElement2.click();
	
	
	
	//String s=(String) att;
	//System.out.println(att);
	
	//WebElement btnLogin = driver.findElement(By.name("login"));
	//jk.executeScript("arguments[0].click()", btnLogin);

	}
}