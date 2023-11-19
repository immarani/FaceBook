package facebooktest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassForFacebook implements  IBaseclassFaceBook{
public static WebDriver driver;
public static TakesScreenshot screenshot;
public static Select s;
public static Actions ac;
public static Robot r;
public static Alert a;


	@Override
	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		screenshot=(TakesScreenshot)driver;
		}
	@Override
	public void browserClose() {
			driver.quit();
	}
	@Override
	public void sendText(WebElement e, String value) {
		e.sendKeys(value);
	}
@Override
	public void selectkey(WebElement e, String values) {
		 s=new Select(e);
		s.selectByValue(values);	
	}
	@Override
	public void sendText(String value, WebElement e) {
		a.sendKeys(value);
		}
@Override
	public void button(WebElement e) {
		e.click();
		}
@Override
	public void button(WebElement e, int z) {
e.click();	
	}
@Override
	public void takescreenshot(String scrnshot) throws IOException  {
		 
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dsnt=new File("C:\\Users\\imimm\\eclipse-workspace\\ProjectHotelMMTrip\\target\\"+scrnshot+".png");
		FileUtils.copyFile(src,dsnt);
		
	}
@Override
	public void selectkey(WebElement e, int values) {
		 s=new Select(e);
		 s.selectByIndex(values);
	}
@Override
	public void selectvisibleText(WebElement e, String values) {
		s=new Select(e);
		}
@Override
	public void clickText(WebElement e, String value) {
		ac.click(e).build().perform();
		}
@Override
	public String getAttributeText(WebElement e,String value) {
	String g=e.getAttribute(value);
	return g;
		}
@Override
	public String getTextValue(WebElement e) {
		String s=e.getText();
		return s;
}
@Override
	public void moveElement(WebElement e) {
		ac.moveToElement(e);
		}

	@Override
	public void doubleClickText(WebElement e) {
		ac.doubleClick(e);
		}
@Override
	public void sendText(WebElement e, String value, String value1) {
		ac.sendKeys(value);
		}
@Override
	public void contextClick(WebElement e) {
		ac.contextClick(e);
		
	}
@Override
	public void pressKey() throws AWTException {
		r=new Robot();
		r.keyPress(0);
		}
@Override
	public void pressRelease() throws AWTException {
		r=new Robot();
		r.keyRelease(0);
	}
@Override
	public void keyEvent(String value) throws AWTException {
	r=new Robot();
	keyEvent(value);
		
	}
@Override
	public void acceptFrame(WebElement e, String value) {
		a.accept();
		}
@Override
	public void dismissFrame(WebElement e, String value) {
		a.dismiss();
		}
@Override
	public void getText(WebElement e, String value, int i) {
		a.getText();
	}
@Override
public void dD(WebElement e, WebElement e1) {
	ac.dragAndDrop(e, e1);
	
}
@Override
public void handleWindows() {
	String parentUrl = driver.getWindowHandle();
	Set<String> childUrl = driver.getWindowHandles();
	for(String child : childUrl) {
		if(!child.equals(parentUrl)) {
			driver.switchTo().window(child);
		}
		}
	}
@Override
public void handleiframe(String value) {
driver.switchTo().frame(value);
	}
@Override
public void handleiframe(int id) {
	driver.switchTo().frame(0);
	
}
@Override
public void handleiframe(WebElement e) {
	driver.switchTo().frame(e);
	}
@Override
public List<WebElement> optionsSelect(WebElement e) {
	s = new Select(e);
	List<WebElement> options = s.getOptions();
	return options;
	
}


}
