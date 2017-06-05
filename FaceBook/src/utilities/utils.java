package utilities;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.lang.model.element.ExecutableElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class utils
{
	public static WebDriver driver;
	public static String timeStamp = new SimpleDateFormat ("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
	public static String location ;
	public static ExtentReports extent ;
	public static ExtentTest test ;
	private static String sPathFile = "projConfig.xml" ;
	
	// This Function Initiate a Test for it's Logs and reports
    // <param name="sTestName">Test Name</param>
    // <param name="sTestDescription">test Description</param>
	
	public void initTest ( String sTestName, String sTestdescription ) throws ParserConfigurationException, SAXException, IOException 
	{
		location = getData ("ReportFilePath") + "Execution_" + timeStamp + "\\";
		File dir = new File (location);
		dir.mkdirs();
		test = extent.startTest(sTestName, sTestdescription );		
	}

	
	 // This Function Reads data from XML Configuration File
    // <param name="sNodeName">Attribute (Node) Name</param>
    // <returns>Attribute (Node) Value</returns>
    public static String getData(String sNodeName) throws ParserConfigurationException, SAXException, IOException
    {
    	File fXmlFile = new File(sPathFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);		
		doc.getDocumentElement().normalize();
		return doc.getElementsByTagName(sNodeName).item(0).getTextContent();
    }
    
 // This Function Initiate Extent Report and put it to the extent Object
    public static void initExtentReport() throws ParserConfigurationException, SAXException, IOException
    {
        extent = extentReportManager.Instance(timeStamp);
    }
    
 // This Function Finalize The Extent Test 
    public void finilizeExtentReportTest() throws ParserConfigurationException, SAXException, IOException
    {
        extent.endTest(test); 
    }
    
    // This Function Finalize The Extent Report
    public static void finilizeExtentReport()
    {
        extent.flush();
        extent.close();
    }
    
    
    
	
}
