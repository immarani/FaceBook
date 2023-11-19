//package facebook;
//
//import java.io.File;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class FaceBookNewAccount {
//	  static WebDriver driver;
//	public static void screenshot(String srcn) throws Throwable {
//		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
//		File src =takescreenshot .getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\imimm\\eclipse-workspace\\ProjectHotelMMTrip\\target\\" +srcn+ ".png");
//		FileUtils.copyFile(src, desc);
//	}
//	
//		@Given("user launch the face web Application {string}")
//		public void user_launch_the_face_web_Application(String url) throws Throwable {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			driver.get(url);
//			driver.manage().window().maximize();
//			//screenshot("sc1");
//			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		   
//		}
//
//		@When("user click on create new account button")
//		public void user_click_on_create_new_account_button() throws Throwable {
//		   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		   Thread.sleep(2000);
//		}
//
//		@When("user enter firstname {string}")
//		public void user_enter_firstname(String firstname) throws Throwable {
//		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
//		 
//		  //  screenshot("sc2");
//		    Thread.sleep(2000);
//		}
//
//		@When("user enters the surname {string}")
//		public void user_enters_the_surname(String surname) throws Throwable {
//			 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
//			 
//			// screenshot("sc3");
//			 Thread.sleep(2000);
//		}
//
//		@When("user enters the mobile number or email value {string}")
//		public void user_enters_the_mobile_number_or_email_value(String number) throws Throwable {
//			WebElement mobile= driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
//			mobile.sendKeys(number);
//
//			// screenshot("sc4");
//			 Thread.sleep(2000);
//		}
//
//		@When("user enters the new password {string}")
//		public void user_enters_the_new_password(String password) throws Throwable {
//			driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(password);
//
//			// screenshot("sc5");
//			Thread.sleep(2000);
//		    
//		}
//
////		@When("user select the date of birth")
////		public void user_select_the_date_of_birth() {
////		   WebElement day=driver.findElement(By.id("day"));
////		   day.click();
////		   WebElement dayvalue=driver.findElement(By.xpath("//option[@value='20']"));
////		   Actions ac=new Actions(driver);
////		   ac.moveToElement(dayvalue).build().perform();
////		   ac.click().build().perform();
////		}
//		@When("user select the day {string}")
//		public void user_select_the_day(String dayvalue) throws Throwable {
//			WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
//			day.click();
//			Select s = new Select(day);
//			
//			List<WebElement> options = s.getOptions();
//			for(WebElement x : options) {
//				String value=x.getText();
//				if(value.equals(dayvalue)) {
//					driver.findElement(By.xpath("//option[text()='31']//preceding::option[@value='"+value+"']")).click();
//
//					// screenshot("sc6");
//		}}
//			}
//		@When("user select the month {string}")
//		public void user_select_the_month(String month) throws Throwable {
//			WebElement monthvalue =driver.findElement(By.xpath("//select[@id='month']"));
//			monthvalue.click();
//			Select m = new Select(monthvalue);
//			
//			List<WebElement> options = m.getOptions();
//			for(WebElement mon : options) {
//				String Monthselect=mon.getText();
//				if(Monthselect.equals(month)) {
//					driver.findElement(By.xpath("//option[@value='31']//following::option[@value='"+month+"']")).click();
//
//					// screenshot("sc7");
//		}
//			}
//		}
//		@When("user select the year {string}")
//		public void user_select_the_year(String years) throws Throwable {
//			 WebElement year=driver.findElement(By.id("year"));
//		   year.click();
//		   Thread.sleep(2000);
//			Select s2 = new Select(year);
//			
//			
//			List<WebElement> options = s2.getOptions();
//			for(WebElement z : options) {
//				String yearvalue=z.getText();
//				
//				if(yearvalue.equals(years)) {
//		   WebElement dayvalue=driver.findElement(By.xpath("//option[@value='"+years+"']"));
//			  
//						//dayvalue.click();
//
//						 screenshot("sc8");
//					//	Thread.sleep(2000);
//			}
//				}
//		}
//
//		@When("user select the gender Option {string}")
//		public void user_select_the_gender_Option(String gender) throws Throwable {
//			WebElement genders=driver.findElement(By.xpath("//label[text()='"+gender+"']"));
//			genders.click();
//
//			// screenshot("sc9");
//		}
//
//
//		@When("user clicks on singup button {string}")
//		public void user_clicks_on_singup_button(String screen) throws Throwable {
//	WebElement enter = driver.findElement(By.xpath("//input[@type='hidden']//preceding::button[text()='Sign Up']"));
//	enter.click();
//	screenshot("screen");
//Thread.sleep(2000);
//	 //screenshot("screen");
//					
//		   
//		}
//
//		@Then("Verify firstname,surname ,mobile number or email ,password,dob,gender,signup")
//		public void verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new cucumber.api.PendingException();
//		}
//
//
//
//	}
//
//
