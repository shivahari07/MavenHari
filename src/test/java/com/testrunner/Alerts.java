package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Alerts extends BaseClass {

	public static WebDriver driver;

	public static void Alert() throws InterruptedException {
		driver = browserlaunch("chrome");
		driver = getUrl("https://demo.automationtesting.in/Alerts.html");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Actionss("moveto", button);
		
		
		Alerts("accept");

		/*WebElement head = driver.findElement(By.xpath("//div[@class='col-sm-8 col-xs-8 col-md-8']/h1"));

		Actionss("dclick", head);
		Thread.sleep(3000);*/
		
		  driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		 WebElement box = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		 box.click();
		 Alertsendkeys("hari"); 
		  Thread.sleep(3000);
		  
		 
		 
		 
	}

	public static void main(String[] args) throws InterruptedException {
		Alert();
	}
}
