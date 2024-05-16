package com.TestEngine;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonGetName {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	private void setproperty() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Driver\\chromedriver.exe");
driver= new ChromeDriver();
	}

	@BeforeClass
	private void login() {
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
	}
	
	@Test
	private void stringname() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='nav-search']/form/div/following::div/div/input[@id='twotabsearchtextbox']")).sendKeys("Iphone" + Keys.ENTER);
		WebElement am = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]"));
		//driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']/ancestor::div[@data-index='3']")).click();
      
		/* Set<String> Windows = driver.getWindowHandles();
        
       
        ArrayList<String> tabs = new ArrayList<>(Windows);
        
        driver.switchTo().window(tabs.get(1));*/
        
        
       
	//WebElement amazon = driver.findElement(By.xpath("//div[@data-csa-c-id='t7ainx-xet7cw-obobjn-ckghs4']"));
	String text = am.getText();
	System.out.println(text);
	//softassert
	String expected = text;
	String actual = "Apple iPhone 15 (128 GB) - Black";
	String actual2 = "Apple iPhone 16 (128 GB) - Black";
	assertEquals(expected, actual);
	System.out.println("right");
	
	SoftAssert SA = new SoftAssert();
	SA.assertEquals(text, actual2);
	SA.assertAll();
	System.out.println("SoftAssert");
	}
	
	
	}



