package com.TESTENGINE2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Amazon {
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
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}
	
	@BeforeMethod
	private void Login() {
		WebElement User = driver.findElement(By.cssSelector("#ap_email"));
		User.sendKeys("8637615641");
		   driver.findElement(By.xpath("//input[@id='continue']")).click();
		   WebElement pass = driver.findElement(By.cssSelector("[type='password']"));
		   pass.sendKeys("Hari@123");
		   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}
	
	@Test
	private void Iphonecart() {
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone" + Keys.ENTER);
		WebElement IphonePink = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Pink']/parent::a/parent::h2/parent::div/following-sibling::div/following-sibling::div/div/div/div/div/div//span/span[text()='₹72,500']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();", IphonePink);
		 IphonePink.click();
		// driver.findElement(By.xpath("(//span[text()='Add to Cart']/parent::span/input[@id='add-to-cart-button'])[2]")).click();
driver.findElement(By.xpath("//span[text()='Without Exchange']/ancestor::div[@id='newAccordionRow_0']//input[@id='add-to-cart-button']")).click();
	}

}
