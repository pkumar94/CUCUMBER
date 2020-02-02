package Utilities;



import org.junit.AfterClass;
import org.junit.BeforeClass;

import Reporting.Report_Setup;


public class Hooks 
{
	public static 	Common_Functions commonFunctions;
	@BeforeClass
	public static void setup() throws Exception
	{
		System.out.println("before hooke");
		commonFunctions = new Common_Functions();
		System.out.println("after common function");
		Report_Setup.InitializeReport();
		System.out.println("After report initializtion");
		commonFunctions.startRecording();
		System.out.println("After recording"); 
		
		
		
	}
	@AfterClass
	public void teardown() throws Exception
	{
		Report_Setup.extent.endTest(Report_Setup.test);
		Report_Setup.extent.flush();
		commonFunctions.stopRecording();
	}

}
