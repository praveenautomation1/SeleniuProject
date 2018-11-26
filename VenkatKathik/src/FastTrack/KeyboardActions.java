package FastTrack;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class KeyboardActions {
public static void main(String[] args) throws Exception{
	
	ChromeDriver Brow = new ChromeDriver();
	Brow.get("http://apps.qaplanet.in/qahrm");
    Brow.findElementByXPath("//input[@name='txtUserName']").sendKeys("qaplanet1");
	Brow.findElement(By.name("txtPassword")).sendKeys("lab1");
	
	WebElement e1=Brow.findElement(By.name("txtPassword"));
	
WebElement E=Brow.findElementByName("Submit");
e1.sendKeys(Keys.ENTER);
Thread.sleep(2000);
WebElement e2=Brow.findElementByXPath("//div[@id='rightHeaderImage']");
	e2.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	/*
	Thread.sleep(2000);
	Brow.switchTo().frame("rightMenu");
WebElement e=Brow.findElementByXPath("//input[@name='loc_name']");
*/




}
}
