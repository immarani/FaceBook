package com.makemytrip;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotel {
	WebDriver driver;
	 String value="Bangalore";
	String checkindate="//div[@aria-label='Sat Nov 25 2023']";
	String checkoutdate="//div[@aria-label='Mon Dec 25 2023']";
	String Rooms="//button[text()='Apply']";
	public  void takescreenshot(String scrshot) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\imimm\\eclipse-workspace\\ProjectHotelMMTrip\\target\\"+scrshot+".png");
		FileUtils.copyFile(src, desc);
	}
	
	
	@Given("-Launch MakeMyTrip Application")
	public void launch_MakeMyTrip_Application() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		takescreenshot("scr1");
	
	   
	}

	@When("User close the advertisement popup")
	public void user_close_the_advertisement_popup() throws Throwable {
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		Thread.sleep(5000);
		//WebElement iframe = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");//iframe
	Thread.sleep(3000);
	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();//ads
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();//popup
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();//popup
	
	}

	@When("User clicks on Hotel")
	public void user_clicks_on_Hotel() throws Throwable {
	   WebElement hotel=driver.findElement(By.xpath("//span[text()='Homestays & Villas']//preceding::span[text()='Hotels']"));
	   hotel.click();
	  takescreenshot("scr2");
	}

	@When("User enters the location")
	public void user_enters_the_location() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='City, Property name or Location']")) .click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='CLEAR']")).click();
		   driver.findElement(By.xpath("//input[@title='Where do you want to stay?']")).sendKeys(value);
		  Thread.sleep(2000);
		   WebElement banga= driver.findElement(By.xpath("//span[text()='Outer Ring Road']/ancestor::li/preceding-sibling::li//span[@class='blackText']"));
		   Actions ac=new Actions(driver);
		   ac.moveToElement(banga).build().perform();
		   ac.click().build().perform();
		   takescreenshot("scr3");
	   
	}

	@When("User selects the Check-In date")
	public void user_selects_the_Check_In_date() throws Throwable {
	  WebElement checkin=driver.findElement(By.xpath("//input[@id='checkin']"));
	  checkin.click();
	  Thread.sleep(2000);
	 WebElement date= driver.findElement(By.xpath(checkindate));
	 date.click();
	 takescreenshot("scr4");
	}

	@When("User selects the Check-Out date")
	public void user_selects_the_Check_Out_date() throws Throwable {
//		 WebElement checkout=driver.findElement(By.xpath("//input[@id='checkout']"));
//	  checkout.click();
	  Thread.sleep(2000);
		 driver.findElement(By.xpath(checkoutdate)).click();
		takescreenshot("scr5");
	    
	}

	@When("user selects the Rooms&Guest")
	public void user_selects_the_Rooms_Guest() throws Throwable {
	   driver.findElement(By.xpath(Rooms)).click();
	  takescreenshot("scr6");
	}

	@When("User clicks on Search")
	public void user_clicks_on_Search() throws Throwable {
	   driver.findElement(By.xpath("//button[text()='Search']")).click();
	   takescreenshot("scr7");
	}

	@Then("verify the location,Check-In date,Check-Out date,Rooms&Guest")
	public void verify_the_location_Check_In_date_Check_Out_date_Rooms_Guest() throws Throwable {
	   WebElement value1=driver.findElement(By.xpath("//input[@value='Bangalore']"));
	   WebElement checkinvalue=driver.findElement(By.xpath("//input[@value='Sat, 25 Nov 2023']"));
	   WebElement checkoutvalue=driver.findElement(By.xpath("//input[@value='Mon, 25 Dec 2023']"));
	String s= value1.getAttribute("value");
	System.out.println(s);
	   if(s.equals(value)) {
		   System.out.println("location is :" +s);
	   }
	   else {
		   System.out.println("not equal");
	   }
	   String s1= value1.getAttribute("value");
		System.out.println(s);
		   if(s1.equals(checkindate)) {
			   System.out.println("location is :" +s1);
		   }
		   String s2= value1.getAttribute("value");
			System.out.println(s);
			   if(s2.equals(checkoutdate)) {
				   System.out.println("location is :" +s2);
			   }
		  
	  takescreenshot("scr8");
	}


	

	}


