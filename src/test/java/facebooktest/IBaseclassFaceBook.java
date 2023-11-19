package facebooktest;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface  IBaseclassFaceBook {
	public void browserLaunch(String url);
	public void browserClose();
	public void sendText(WebElement e, String value);
	public void clickText(WebElement e, String value);
	public String getAttributeText(WebElement e,String value);
	public String getTextValue(WebElement e );
	//public void findElement(WebElement e);
	
	public void dD( WebElement e,WebElement e1);//Action
	public void moveElement(WebElement e);//Actions
	public void doubleClickText(WebElement e);//Actions
	public void sendText(WebElement e, String value,String value1);//Actions
	public void contextClick(WebElement e);//Actions
	
	public void pressKey()throws Throwable;//Robot
	public void pressRelease()throws Throwable;
	public void keyEvent(String value)throws Throwable;
	
	public void acceptFrame(WebElement e, String value);//Alerts
	public void dismissFrame(WebElement e, String value);
	public void sendText( String value,WebElement e); 
	public void getText( WebElement e,String value,int i);
	//public void getAttribut( WebElement e,String value);
	
	
	public void selectkey(WebElement e,String values); //select
	public void selectkey(WebElement e,int values); 
	public void selectvisibleText(WebElement e,String values); //select
	//public void sendText(String value,WebElement e);
	public void button(WebElement e);
	public void button(WebElement e, int z);
	public void handleWindows();//window
	public void handleiframe(String value);//frame
	public void handleiframe(int id);//frame
	public void handleiframe(WebElement e);//frame
	public List<WebElement> optionsSelect(WebElement e);
	public void takescreenshot(String value) throws Throwable;
	
}
