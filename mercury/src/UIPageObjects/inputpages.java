package UIPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class inputpages {
	
WebDriver driver;
	
	public inputpages(WebDriver driver)
	{
		this.driver=driver;
		
	}
By type=By.xpath("//input[@value='oneway']");
By passengers= By.xpath("//select[@name='passCount']");
By from=By.xpath("//select[@name='fromPort']");
By on= By.xpath("//select[@name='fromMonth']");
By date= By.xpath("//select[@name='fromDay']");
By arrving= By.xpath("//select[@name='toPort']");
By returning= By.xpath("//select[@name='toMonth']");
By date1=By.xpath("//select[@name='toDay']");
By service=By.xpath("//input[@value='First']");
By airline= By.xpath("//select[@name='airline']");
By continues=By.xpath("//input[@name='findFlights']");

public void type()
{
	driver.findElement(type).click();
}

public void passengers()
{
	Select s= new Select(driver.findElement(passengers));
	s.selectByIndex(1);
}

public void from()
{
	Select s= new Select(driver.findElement(from));
	s.selectByIndex(1);
}
public void on()
{
	Select s= new Select(driver.findElement(on));
	s.selectByIndex(2);
}
public void date()
{
	Select s= new Select(driver.findElement(date));
	s.selectByIndex(5);
}
public void arrving()
{
	Select s= new Select(driver.findElement(arrving));
	s.selectByIndex(4);
}

public void returning()
{
	Select s= new Select(driver.findElement(returning));
	s.selectByIndex(3);
}
public void date1()
{
	Select s= new Select(driver.findElement(date1));
	s.selectByIndex(5);
}
public void service()
{
	driver.findElement(service).click();
}

public void airline()
{
	Select s= new Select(driver.findElement(airline));
	s.selectByIndex(2);
}

public void continues()
{
	driver.findElement(continues).click();
}
}
