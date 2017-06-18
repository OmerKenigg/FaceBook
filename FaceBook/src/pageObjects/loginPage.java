package pageObjects;

import java.awt.AWTException;
import java.io.IOException;
import static org.junit.Assert.fail;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import utilities.extentReportManager;
import utilities.utils;

public class loginPage extends utils
{
	final WebDriver driver;
	 
	@FindBy(how = How.NAME, using = "firstname") 
	public WebElement FirstName;
	
	@FindBy(how = How.ID, using = "u_0_3")
	public WebElement LastName;
	
	@FindBy(how = How.ID, using = "u_0_7")
	public WebElement Email ;
	
	@FindBy(how = How.ID, using = "u_0_e")
	public WebElement Password ;
  
	@FindBy(how = How.ID, using = "u_0_m")
	public WebElement submit ;

//	@FindBy(how = How.ID, using = "u_0_e")
//	public WebElement Password ;
 
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// This FUnction Login to Main Page
	// Parameter: sFirstName - User Name , sLastName - Last Name ,sEmail - Email,  sPassword - Password
	// Returned Value - None
	public void action(String sFirstName, String sLastName, String sEmail, String sPassword )
	{		
		FirstName.sendKeys(sFirstName);
		LastName.sendKeys(sLastName);
		Email.sendKeys(sEmail);
		Password.sendKeys(sPassword);
		submit.click();
	}	
	
	public void selectTab(String tabName) throws ParserConfigurationException, SAXException, IOException, AWTException
	{
		try
		{
			switch (tabName.toLowerCase())
			{
	        case "tab 1":
	        	FirstName.click();
	        	break;
	        case "tab 2":
	        	LastName.click();
	        	break;
	        case "tab 3":
	        	Email.click();
	        	break;
	        case "tab 4":
	        	Password.click();
	        	break;
	        case "tab 5":
	        	submit.click();
	        	break;
	        default:
	        	test.log(LogStatus.FAIL, tabName + " : Wrong Selection");	
	        	fail("Problem with Selecting Tab, See Report for more Details");
	        	break;
			}			
			test.log(LogStatus.PASS, tabName + " Was Selected Successfully");	
		}
		catch (Exception exp)
		{
			test.log(LogStatus.FAIL, "Problem with Selecting Tab, Error Message: " + exp.getMessage() + test.addScreenCapture(extentReportManager.CaptureScreen(timeStamp)));
			fail("Problem with Selecting Tab, See Report for more Details");
		}
	}
}


