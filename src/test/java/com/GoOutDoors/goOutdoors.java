package com.GoOutDoors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class goOutdoors {
	public static WebDriver driver;
	
	@BeforeSuite
	private void SetProperty() {

System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Driver\\chromedriver.exe");

}

@BeforeTest
private void browserLaunch() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
@BeforeClass
private void getURl() throws InterruptedException {

    driver.get("https://www.gooutdoors.co.uk/");
    driver.navigate().refresh();
    Thread.sleep(3000);
    driver.navigate().refresh();

    driver.navigate().refresh();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Login/Register']")).click();
    WebElement Email = driver.findElement(By.xpath("//input[@id='email_address']"));
    Email.sendKeys("Husseyhari@gmail.com");
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys("Hari@123");
    driver.findElement(By.xpath("//input[@id='blacks-member-login']")).click();
    


    

}

@Test
private void login() throws InterruptedException {
	WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(men).perform();
	driver.findElement(By.xpath("//div[@id='ui-id-24']/a[text()='Casual Jackets']")).click();
    
 
    	
    
}
}
