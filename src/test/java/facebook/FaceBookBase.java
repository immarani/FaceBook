package facebook;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facebooktest.BaseClassForFacebook;


public class FaceBookBase extends BaseClassForFacebook{
	BaseClassForFacebook fbb=new BaseClassForFacebook();
		
		
			@Given("user launch the face web Application {string}")
			public void user_launch_the_face_web_Application(String url) throws Throwable {
			fbb.browserLaunch(url);
			fbb.takescreenshot("launch");
			
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   
			}

			@When("user click on create new account button")
			public void user_click_on_create_new_account_button() throws Throwable {
			WebElement account=driver.findElement(By.xpath("//a[text()='Create new account']"));
			   fbb.button(account);
			   Thread.sleep(2000);
			}

			@When("user enter firstname {string}")
			public void user_enter_firstname(String firstname) throws Throwable {
			    WebElement namefirst=driver.findElement(By.xpath("//input[@name='firstname']"));
			    fbb.sendText(namefirst, firstname);
		 fbb.takescreenshot("firstname");
			    Thread.sleep(2000);
			}

			@When("user enters the surname {string}")
			public void user_enters_the_surname(String surname) throws Throwable {
				WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
				fbb.sendText(lastname, surname);
				 
				// screenshot("sc3");
				 Thread.sleep(2000);
			}

			@When("user enters the mobile number or email value {string}")
			public void user_enters_the_mobile_number_or_email_value(String number) throws Throwable {
				WebElement mobile= driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
				fbb.sendText(mobile, number);

				// screenshot("sc4");
				 Thread.sleep(2000);
			}

			@When("user enters the new password {string}")
			public void user_enters_the_new_password(String password) throws Throwable {
				WebElement pass=driver.findElement(By.xpath("//input[@aria-label='New password']"));
				fbb.sendText(pass, password);

				// screenshot("sc5");
				Thread.sleep(2000);
			    
			}

//			@When("user select the date of birth")
//			public void user_select_the_date_of_birth() {
//			   WebElement day=driver.findElement(By.id("day"));
//			   day.click();
//			   WebElement dayvalue=driver.findElement(By.xpath("//option[@value='20']"));
//			   Actions ac=new Actions(driver);
//			   ac.moveToElement(dayvalue).build().perform();
//			   ac.click().build().perform();
//			}
			@When("user select the day {string}")
			public void user_select_the_day(String dayvalue) throws Throwable {
				WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
				fbb.button(day);
				
				List<WebElement> options = fbb.optionsSelect(day);				
//				List<WebElement> options = s.getOptions();
				for(WebElement x : options) {
					
					String s=fbb.getTextValue(x);
					if(s.equals(dayvalue)) {
		WebElement getday=driver.findElement(By.xpath("//option[text()='31']//preceding::option[@value='"+dayvalue+"']"));
		fbb.button(getday);

						// screenshot("sc6");
			}}
				}
			@When("user select the month {string}")
			public void user_select_the_month(String month) throws Throwable {
				WebElement monthvalue =driver.findElement(By.xpath("//select[@id='month']"));
				fbb.button(monthvalue);
				//fbb.selectkey(monthvalue, month);
				List<WebElement> optionsSelect = fbb.optionsSelect(monthvalue);
				
				//List<WebElement> options = m.getOptions();
				for(WebElement monthvalues : optionsSelect) {
					String Monthselect=fbb.getTextValue(monthvalue);
					if(Monthselect.equals(month)) {
			WebElement months=driver.findElement(By.xpath("//option[@value='31']//following::option[@value='"+Monthselect+"']"));
         fbb.button(months);
						// screenshot("sc7");
			}
				}
			}
			@When("user select the year {string}")
			public void user_select_the_year(String years) throws Throwable {
				 WebElement year=driver.findElement(By.id("year"));
			  //fbb.clickText(year, years);
				 fbb.button(year);
			   Thread.sleep(2000);
				//fbb.selectkey(year, years);
			   fbb.button(year);
				
				
				List<WebElement> Options = fbb.optionsSelect(year);
				for(WebElement yearselect : Options) {
					String selectyear=fbb.getTextValue(yearselect);
					
					
					if(selectyear.equals(years)) {
			   WebElement dayvalue=driver.findElement(By.xpath("//option[@value='"+years+"']"));
				  fbb.button(dayvalue);
							

							
						//	Thread.sleep(2000);
				}
					}
			}

			@When("user select the gender Option {string}")
			public void user_select_the_gender_Option(String gender) throws Throwable {
				WebElement genders=driver.findElement(By.xpath("//label[text()='"+gender+"']"));
				fbb.button(genders);

				
			}


			@When("user clicks on singup button {string}")
			public void user_clicks_on_singup_button(String screen) throws Throwable {
		WebElement enter = driver.findElement(By.xpath("//input[@type='hidden']//preceding::button[text()='Sign Up']"));
	fbb.button(enter);
	fbb.takescreenshot(screen);
	Thread.sleep(2000);
		 
						
			   
			}

			@Then("Verify firstname,surname ,mobile number or email ,password,dob,gender,signup")
			public void verify_firstname_surname_mobile_number_or_email_password_dob_gender_signup() {
			    // Write code here that turns the phrase above into concrete actions
			    throw new cucumber.api.PendingException();
			}



		}



