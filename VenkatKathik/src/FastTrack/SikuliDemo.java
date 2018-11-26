package FastTrack;


import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.Screen;

public class SikuliDemo {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElementByName("txtUserName").sendKeys("qaplanet1");
		driver.findElementByName("txtPassword").sendKeys("lab1");
		driver.findElementByName("Submit").click();
		driver.switchTo().frame("rightMenu");
		// click on add
		
		driver.findElementByXPath("//div[@class='actionbuttons']/input[1]").click();
		// click on choose file
		driver.findElementByXPath("//input[@name='photofile']").click();
	Screen s=new Screen();
	
	if(s.exists("C:\\Users\\QAPLANET\\Documents.sikuli\\1543236535390.png")!=null) {
		System.out.println("Image upload window is available");
		s.type("C:\\Users\\QAPLANET\\Documents.sikuli\\1543236535390.png", "C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		s.click("C:\\Users\\QAPLANET\\Documents.sikuli\\1543236664462.png");
		
	}
}
}