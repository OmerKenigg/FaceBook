package pageObjects;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.utils;

public class loginPage extends utils
{
	final WebDriver driver;
	
	@FindBy (how = How.NAME, using = "firstname")
	public WebElement FirstName ;
	
	@FindBy (how = How.NAME, using = "lastname")
	public WebElement LastName;
	
	@FindBy (how = How.NAME, using = "reg_email__")
	public WebElement Email ;
	
	@FindBy (how = How.NAME, using = "reg_passwd__")
	public WebElement PassWord ;
	
	@FindBy (how = How.ID, using = "day")
	public WebElement DayBirthDay ;
	

	@FindBy (how = How.ID, using = "month")
	public WebElement MonthBirthDay ;
	
	@FindBy (how = How.ID, using = "year")
	public WebElement YearBirthDay ;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	

}
