package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class RunClass extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
		 driver = browserlaunch("chrome");	
//		driver.get("https://adactinhotelapp.com/");
		driver = getUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
isSelected(username);
		
		//		username.sendKeys("hari0207");
		
		sendKeyElement(username, "hari0207");
		
		WebElement pass = driver.findElement(By.id("password"));
		Alertsendkeys(null);	
//		pass.sendKeys("Hari@123");
		
		sendKeyElement(pass, "Hari@123");
		WebElement login = driver.findElement(By.id("login"));
//		login.click();
		
		/*dropDown("value", login, "6");
		dropDown("index", login, "4");
		dropDown("text", login, "fire");*/
		
		
		Actionss("dclick", login);
	}
	
	}
	private void Actionss() {
		// TODO Auto-generated method stub

	}
	
		
	

}

