package businessScenarios;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import utilities.commonOps;
import utilities.utils;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class sanityTests extends utils
{
	private static commonOps comOps = new commonOps();
	private static WebDriverWait wait ;
	private static String mainWindowHandle ;
	private static pageObjects.Developers Develop = new pageObjects.Developers(driver);
	private static pageObjects.loginPage login = new pageObjects.loginPage(driver);
	
    // Test 01: Verify Tabs in Main Page
    @Test
    public void test01_tabVerification() throws ParserConfigurationException, SAXException, IOException, AWTException
    {
    	initTest(testName.getMethodName(), "This is Test Number 1");
//   	 login.selectTab("Tab 3");
//   	 comOps.verifyElementExists(home.tabText1);
//   	 comOps.verifyElementExists(home.tabText2);
//   	 comOps.verifyElementExists(home.tabText3);
//   	 comOps.verifyElementExists(home.tabText4);
//   	 comOps.verifyElementExists(home.tabText5);; 
//   	 comOps.verifyElementDisplay(home.tabText3);
//   	 comOps.verifyElementNotDisplay(home.tabText1); 
//   	 comOps.verifyElementNotDisplay(home.tabText2);
//   	 comOps.verifyElementNotDisplay(home.tabText4);
//   	 comOps.verifyElementNotDisplay(home.tabText5);
    }
	
	// Rule that Handles test name for logs
	 	@Rule
	     public TestName testName = new TestName();
	 	
	    @Rule
	     public TestWatcher testWatcher = new TestWatcher()
	     {
	         @Override
	         protected void starting(final Description description)
	         {
	             String methodName = description.getMethodName();
	             String className = description.getClassName();
	             className = className.substring(className.lastIndexOf('.') + 1);
	             System.err.println("Starting JUnit-test: " + className + " " + methodName);
	         }
	     };

}
