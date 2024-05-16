package com.Task1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.xpath("//input[@id ='username']"));
        name.sendKeys("hari0207");		
        driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("Hari@123");
        driver.findElement(By.xpath("//input[@class ='login_button']")).click();
        Thread.sleep(2000);
        WebElement location = driver.findElement(By.xpath("//select[@name ='location']"));
        Select s = new Select(location);
        s.selectByIndex(2);
        WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
        Select h = new Select(Hotel);
        h.selectByValue("Hotel Creek");
        WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
        Select r = new Select(room);
        r.selectByVisibleText("Double");
        
        WebElement roomss = driver.findElement(By.xpath("//select[@name='room_nos']"));
        Select nor = new Select(roomss);
        nor.selectByVisibleText("4 - Four");
        
        WebElement acount = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select c = new Select(acount);
        c.selectByIndex(3);
        
        WebElement ccount = driver.findElement(By.xpath("//select[@name='child_room']"));
        Select co = new Select(ccount);
        co.selectByIndex(4);
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
        driver.findElement(By.xpath("//input[@name='continue']")).click();
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
        
        
        
       driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

        Thread.sleep(7000);

        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
 driver.findElement(By.xpath("(//input[@value='1229066'])")).click();       
 
/* TakesScreenshot sc=(TakesScreenshot)driver;
 File source = sc.getScreenshotAs(OutputType.FILE);
 File dest = new File("C:\\Users\\husse\\eclipse-workspace\\Selenim concepts\\Screenshots\\.png");
FileUtils.copyFile(source, dest);
 */
        driver.findElement(By.xpath("//input[@id='logout']")).click();
        
        
	}

}
