package practice;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import UIPageObjects.inputpages;

public class Inputforms {
		
	WebDriver driver;
	inputpages input=new inputpages(driver);
	
//	@BeforeTest
//	public void initiatedriver() throws InterruptedException
//	{
//		System.setProperty("webdriver.chrome.driver","O:\\Softwares\\chromedriver.exe");
//		driver=new ChromeDriver();
//		Thread.sleep(2000);
//		driver.get("http://newtours.demoaut.com/");
//	}
	
	@Test()
	public void luanch()
	{
	input.type();
	input.passengers();
	input.from();
	input.on();
	input.date();
	input.arrving();
	input.returning();
	input.date1();
	input.service();
	input.airline();
	input.continues();
	}


@AfterTest()
public void close()
{
	driver.quit();
}
}
