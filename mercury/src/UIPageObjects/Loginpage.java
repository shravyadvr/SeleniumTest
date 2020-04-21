package UIPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	WebDriver driver;
	
	By UserName= By.xpath("//input[@name='userName']");
	
	By Password= By.xpath("//input[@name='password']");
	
	By SignIn=By.xpath("//input[@name='login']");
	
	public void login(WebDriver driver)
	{
		this.driver=driver;
	}
	
		public void UserName()
		{
			driver.findElement(UserName).sendKeys("Antony33");
		}

		public void Password()
		{
			driver.findElement(Password).sendKeys("Antony33");
		}
		
		public void SignIn()
		{
			driver.findElement(SignIn).click();
		}
}

