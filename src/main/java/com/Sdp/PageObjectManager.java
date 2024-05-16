package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.BookHotel;
import com.Pom.BookingConfirm;
import com.Pom.LoginPage;
import com.Pom.SearchHotel;
import com.Pom.SelectHotel;

public class PageObjectManager {
	public static WebDriver driver;// null

	private LoginPage lp;// we have to keep all webpages to manage all webelements here

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getInstanceLp() {
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public SearchHotel getInstanceSh() {
		SearchHotel Sh = new SearchHotel(driver);
		return Sh;
	}

	public SelectHotel getInstanceSelectHotel() {
		SelectHotel selhotel = new SelectHotel(driver);
		return selhotel;
	}

	public BookHotel getInstanceBookHotel() {
		BookHotel bukht = new BookHotel(driver);
		return bukht;
	}

	public BookingConfirm getInstanceBookingConfirm() {
		{
			BookingConfirm bc = new BookingConfirm(driver);
			return bc;
		}
	}
	
}

