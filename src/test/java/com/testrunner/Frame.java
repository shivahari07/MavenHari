package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Frame extends BaseClass {

	public static void main(String[] args) {
		//browserlaunch("firefox");
		browserlaunch("chrome");
		getUrl("https://letcode.in/frame");
		WebElement fram = driver.findElement(By.xpath("//iframe[@id ='firstFr']"));
		clickOnElement(fram);
		Frames("frame", 0, fram);
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("hari");
		Navigates("forward", null);
		Frames("Frame1", 1, null);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("husseyhari@gmail.com");
		Frames("parentframe", 0, null);
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("haran");
		Frames("default", 0, null);
		driver.findElement(By.xpath("//a[text()='Product']")).click();

	}

}
