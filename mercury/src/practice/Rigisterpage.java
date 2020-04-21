package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import UIPageObjects.Loginpage;

public class Rigisterpage 
{
	public Loginpage login=new Loginpage();
	
	public WebDriver driver;
	
	@BeforeTest
	public void initiatedriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","O:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://newtours.demoaut.com/");
	}

	@Test()
	
	public void login()
	{
		login.login(driver);
		login.UserName();
		login.Password();
		login.SignIn();
	}
	
}

