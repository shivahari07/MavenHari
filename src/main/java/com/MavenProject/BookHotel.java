package com.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;

	@FindBy(id="firstname")
	private static WebElement firstname;
	
	@FindBy(id="lastname")
	private static WebElement lastname;
	
	@FindBy(id="address")
	private static WebElement address;
	
	@FindBy(id="cc_num")
	private static WebElement credit;
	
	@FindBy(id="cc_type")
	private static WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private static WebElement selectMonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement selectYear;
	
	@FindBy(id="cc_cvv")
	private static WebElement cvvNumber;
	
	@FindBy(id="booknow")
	private static WebElement bookNow;
	
	public BookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcredittype() {
return credit;
	}

	public WebElement getcreditcardo() {
		return cardType;
	}
	
	public WebElement getExpiryMonth() {
		return selectMonth;
	}
	
	public WebElement getExpiryYear() {
		return selectYear;
	}
	
	public WebElement getCVVNumber() {
		return cvvNumber;
	}
	public WebElement getBookNowbtn() {
		return bookNow;
	}
	
	
}
