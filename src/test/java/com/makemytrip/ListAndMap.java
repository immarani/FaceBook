package com.makemytrip;


import java.io.File;
import java.util.List;
import java.util.Map;

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
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAndMap {
	WebDriver driver;
	String strings;
	String st; // ?
//	 String value="Bangalore";
String checkindate="//div[@aria-label='Sat Nov 25 2023']";
String checkoutdate="//div[@aria-label='Mon Dec 25 2023']";
	String Room="//button[text()='Apply']";
	
	public  void takescreenshot(String scrshot1) throws Throwable {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\imimm\\eclipse-workspace\\ProjectHotelMMTrip\\target\\"+scrshot1+".png");
		FileUtils.copyFile(src, desc);
	}
	
	@Given("-Launch MakeMyTrip Applications {string}")
	public void launch_MakeMyTrip_Applications(String url) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		takescreenshot("url1");
	    
	}

	@When("User close the advertisement popups")
	public void user_close_the_advertisement_popups() throws Throwable {
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

	@When("User clicks on Hotelclicks")
	public void user_clicks_on_Hotelclicks() {
		driver.findElement(By.xpath("//span[text()='Homestays & Villas']//preceding::span[text()='Hotels']")). click();
		  
	}

	@When("User enters the locations")
	public void user_enters_the_locations(DataTable dataTable) throws Throwable {
		List<String> asList = dataTable.asList();
		String strings = asList.get(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='City, Property name or Location']")) .click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='CLEAR']")).click();
		   driver.findElement(By.xpath("//input[@title='Where do you want to stay?']")).sendKeys(strings);
		  Thread.sleep(2000);
		   WebElement banga= driver.findElement(By.xpath("//span[text()='Outer Ring Road']/ancestor::li/preceding-sibling::li//span[@class='blackText']"));
		   Actions ac=new Actions(driver);
		   ac.moveToElement(banga).build().perform();
		   ac.click().build().perform();
		   takescreenshot("list");
	}
	


	@When("User selects the Check-In date select")
	public void user_selects_the_Check_In_date_select() throws Throwable {
		 WebElement checkin=driver.findElement(By.xpath("//input[@id='checkin']"));
		  checkin.click();
		  Thread.sleep(2000);
		 WebElement date= driver.findElement(By.xpath(checkindate));
		 date.click();
	}

	@When("User selects the Check-Out date select")
	public void user_selects_the_Check_Out_date_select() throws Throwable {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(checkoutdate)).click();
	   
	}

	@When("user selects the Rooms&Guest click")
	public void user_selects_the_Rooms_Guest_click() {
		  driver.findElement(By.xpath(Room)).click();
	}

	@When("User clicks on Search click")
	public void user_clicks_on_Search_click() {
		 driver.findElement(By.xpath("//button[text()='Search']")).click();
	}

	@Then("verify the locationSelect,Check-In date select,Check-Out date select,Rooms&Guest click")
	public void verify_the_locationSelect_Check_In_date_select_Check_Out_date_select_Rooms_Guest_click() {
		 WebElement value1=driver.findElement(By.xpath("//input[@value='"+strings+"']"));
		   WebElement checkinvalue=driver.findElement(By.xpath("//input[@value='Sat, 25 Nov 2023']"));
		   WebElement checkoutvalue=driver.findElement(By.xpath("//input[@value='Mon, 25 Dec 2023']"));
		String s= value1.getAttribute("value");
		System.out.println(s);
	}
	

	@When("User clicks on Hotels")
	public void user_clicks_on_Hotels() {
		driver.findElement(By.xpath("//span[text()='Homestays & Villas']//preceding::span[text()='Hotels']")). click();
	   
	}

	@When("User enters the locationplaces")
	public void user_enters_the_locationplaces(DataTable dataTable) throws Throwable {
		  Map<String, String> asMaps = dataTable.asMap(String.class, String.class);
		st=asMaps.get("value3"); // ?
		driver.findElement(By.xpath("//span[text()='City, Property name or Location']")) .click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='CLEAR']")).click();
		   driver.findElement(By.xpath("//input[@title='Where do you want to stay?']")).sendKeys(st);
		  Thread.sleep(2000);
		   WebElement banga= driver.findElement(By.xpath("//p[text()=', City in Tamil Nadu']"));
		   Actions ac=new Actions(driver);
		   ac.moveToElement(banga).build().perform();
		   ac.click().build().perform();
		   takescreenshot("map");
	}
	@When("User selects the Check-In date avaliable")
	public void user_selects_the_Check_In_date_avaliable() throws Throwable {
		 WebElement checkin=driver.findElement(By.xpath("//input[@id='checkin']"));
		  checkin.click();
		  Thread.sleep(2000);
		 WebElement date= driver.findElement(By.xpath(checkindate));
		 date.click();
	   
	}

	@When("User selects the Check-Out dates")
	public void user_selects_the_Check_Out_dates() throws Throwable {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(checkoutdate)).click();
	   
	}

	@When("user selects the Rooms&Guest family")
	public void user_selects_the_Rooms_Guest_family() {
		  driver.findElement(By.xpath(Room)).click();
	   
	}

	@When("User clicks on Searchbutton")
	public void user_clicks_on_Searchbutton() {
		 driver.findElement(By.xpath("//button[text()='Search']")).click();
	   
	}

	@Then("verify the locationplace,Check-In date avaliable,Check-Out dates,Rooms&Guest family")
	public void verify_the_locationplace_Check_In_date_avaliable_Check_Out_dates_Rooms_Guest_family() {
		 WebElement value1=driver.findElement(By.xpath("//input[@value='"+st+"']"));
		   WebElement checkinvalue=driver.findElement(By.xpath("//input[@value='Sat, 25 Nov 2023']"));
		   WebElement checkoutvalue=driver.findElement(By.xpath("//input[@value='Mon, 25 Dec 2023']"));
		String s= value1.getAttribute("value");
		System.out.println(s);
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

