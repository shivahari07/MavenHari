package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	
  @FindBy(id="firstname")
  private WebElement firstname;
  
  @FindBy(id="lastname")
  private WebElement lastname;
  
  @FindBy(id="address")
  private WebElement address;
  
  @FindBy(id="cc_num")
  private WebElement creditcardno;
  
  @FindBy(id="cc_type")
  private WebElement creditcardtype;
  
  @FindBy(id="cc_exp_month")
  private WebElement expirymonth;
  
  @FindBy(id="cc_exp_years")
  private WebElement expiryyears;
  
  @FindBy(id="cc_ccv")
  private WebElement ccvnumber;
  
  @FindBy(id="book_now")
  private WebElement booknow;
  
  
  public BookHotel (WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  
  }
  
  

}
