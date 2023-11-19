//package facebook;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class FacebookRunner {
//	static WebDriver  driver;
//	
//	public static void screenshot(String run) throws Throwable {
//		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
//		File src =takescreenshot .getScreenshotAs(OutputType.FILE);
//		File desc = new File("C:\\Users\\imimm\\eclipse-workspace\\ProjectHotelMMTrip\\target\\" +run+ ".png");
//		FileUtils.copyFile(src, desc);
//	}
//	@Given("user launch the face book web Application {string}")
//	public void user_launch_the_face_book_web_Application(String string) throws Throwable {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get(string);
//		driver.manage().window().maximize();
//		screenshot("run1");
//	}
//
//	@When("user clicks on create new account button")
//	public void user_clicks_on_create_new_account_button() throws Throwable {
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		screenshot("run2");
//		 Thread.sleep(2000);
//	}
//
//	@When("user enter firstnametab {string}")
//	public void user_enter_firstnametab(String name) throws Throwable {
//		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
//		 screenshot("run3");
//		    Thread.sleep(2000);
//	}
//
//	@When("user enters the surnametab {string}")
//	public void user_enters_the_surnametab(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user enters the mobile number or email values {string}")
//	public void user_enters_the_mobile_number_or_email_values(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user enters the new passwords {string}")
//	public void user_enters_the_new_passwords(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user select the date of births")
//	public void user_select_the_date_of_births() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user select the gender Options")
//	public void user_select_the_gender_Options() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@When("user clicks on singup buttons")
//	public void user_clicks_on_singup_buttons() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//
//	@Then("Verify firstnametab,surnametab ,mobile number or email values ,passwords,dobs,genderoption,signupbut")
//	public void verify_firstnametab_surnametab_mobile_number_or_email_values_passwords_dobs_genderoption_signupbut() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
//}
//
