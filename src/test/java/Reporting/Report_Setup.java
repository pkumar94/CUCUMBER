package Reporting;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import Utilities.Constants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;




public class Report_Setup 
{
	public static ExtentTest test;
	static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	static Date date = new Date();
	static String d=dateFormat.format(date);
	static String filename="Execution_Summary_"+d+".html";
	public static ExtentReports extent = new ExtentReports(Constants.reportPath+filename, true);


	public static void InitializeReport(){
		try {
			System.out.println("............InitializeReport................");
			Constants.Resultfilename=filename;
			System.out.println(filename);
			//System.out.println(filename);
			test = extent.startTest("report start");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	  		 
	}


}
