package FastTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseActions {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	Actions A = new Actions(driver);
	driver.get("http://apps.qaplanet.in/qahrm");
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	WebElement e= driver.findElementByXPath("//span[contains(text(),'PIM')]");
A.moveToElement(e).perform();
A.moveToElement(driver.findElementByXPath("//span[contains(text(),'Employee List')]")).click().perform();
	
	
	
	
	
	
}
}
