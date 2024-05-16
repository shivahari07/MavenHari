package com.TestEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class SimpleAnnotation extends  BaseClass{

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

	}

	@BeforeClass
	private void getURl() {
		driver.get("https://adactinhotelapp.com/");

	}

		
	

	@Test()
	private void SearchHotel1() throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("//input[@id ='username']"));
sendKeyElement(name, "hari0207");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("Hari@123");
		driver.findElement(By.xpath("//input[@class ='login_button']")).click();
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("//select[@name ='location']"));

		dropDown("index", location, "2");

		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		dropDown("value", Hotel, "Hotel Creek");

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		dropDown("value", room, "Double");

		WebElement roomss = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropDown("text", roomss, "4 - Four");

		WebElement acount = driver.findElement(By.xpath("//select[@name='adult_room']"));
		dropDown("index", acount, "3");

		WebElement ccount = driver.findElement(By.xpath("//select[@name='child_room']"));
		dropDown("index", ccount, "4");
	


		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOnElement(submit);
	}

	@Test(dependsOnMethods = "SearchHotel1")
	private void SearchHotel2() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();

	}

	@Test(priority = 3)
	public void BookAHotel() throws Exception {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("haran");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("67/2 kandaswamy koil st");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("0402042515854525");
		WebElement Type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select t = new Select(Type);
		t.selectByValue("VISA");
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select m = new Select(month);
		m.selectByVisibleText("August");
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select y = new Select(year);
		y.selectByValue("2027");
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("035");

	}

	@Test(priority = 5)
	private void bookingconfirm() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='1229066'])")).click();
		driver.findElement(By.xpath("//input[@id='logout']")).click();

	}
	
	@AfterSuite
	private void deleteAllCookies() {
		driver.close();

		
		
	}


	

	
}
