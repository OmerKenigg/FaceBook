package utilities;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class extentReportManager extends utils
{
	static DateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd_HH-mm-ss");
	static Date date = new Date();
	public static String currentDate = dateFormat.format(date);
	public static String reportdir ="";
	
	// This Function Initial Extent Report
	// Parameters: TimeStamp
	// Returned Value: ExtentReport Instance
	public static ExtentReports Instance (String timeStamp) throws ParserConfigurationException, SAXException, IOException
	{
		ExtentReports extent;
		String Path = getData("Reportfilepath") + "Execution_" + timeStamp + "/" + getData("ReportFileName");
		extent = new ExtentReports(Path, false, DisplayOrder.OLDEST_FIRST);
		return extent;
	}
}