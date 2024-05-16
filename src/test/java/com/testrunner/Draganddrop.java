package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClass.BaseClass;

public class Draganddrop extends BaseClass {
	
	public static WebDriver driver;
public static void main(String[] args) {
	browserlaunch("chrome");
	getUrl("https://www.globalsqa.com/demo-site/draganddrop/");
	//WebElement tatras = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
	WebElement felme = driver.findElement(By.xpath("(//h5[@class='ui-widget-header'])[1]"));
	
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	
	Actions a = new Actions(driver);
	a.dragAndDrop(felme, trash).build().perform();
	//drag(tatras, trash);
	
}
}
