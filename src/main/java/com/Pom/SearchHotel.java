package com.Pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	 @FindBy (id ="location")
	 private WebElement location;
	 
	 @FindBy (id ="room_nos")
	 private WebElement roomno;
	 
	 @FindBy (id ="adultroom")
	 private WebElement adultroom;
	 
	 @FindBy (id ="submit")
	 private WebElement submitbutton;
	 
	 public SearchHotel(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
public WebElement getLocation() {
	return location;
}

public WebElement getRoomno() {
return roomno;
}

public WebElement getAdultRoom() {
return adultroom;
}

public WebElement submitbutton() {
return submitbutton;
}
}
