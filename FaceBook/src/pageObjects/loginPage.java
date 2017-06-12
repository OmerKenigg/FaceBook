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
	//find all the fields of registration.
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
	
	@FindBy (how = How.ID, using = "Sex")
	public WebElement Sex ;
	
	@FindBy (how = How.NAME, using = "websubmit")
	public WebElement Create ;
	//Find some link in the paga
	@FindBy (how = How.LINK_TEXT, using = "Developers")
	public WebElement Developers ;
	
	@FindBy (how = How.LINK_TEXT, using = "Pages")
	public WebElement Pages ;
	
	@FindBy (how = How.LINK_TEXT, using = "Groups")
	public WebElement Groups ;
		
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	// This FUnction Login to Main Page
		// Parameter: sFirstName - User Name , sLastName - LastName , sEmail - email
		// SPassWord - password , sDay - DayBirthDay , 
		// Returned Value - None
		public void action(String sFirstName, String sLastName, String sEmail, String SPassWord ,
				String sDay  )
		{		
			FirstName.sendKeys(sFirstName);
			LastName.sendKeys(sLastName);
			Email.sendKeys(sEmail);
			PassWord.sendKeys(SPassWord);
//			DayBirthDay.sendKeys(sDay);
//			MonthBirthDay.send
			Create.click();
		}
	

}
