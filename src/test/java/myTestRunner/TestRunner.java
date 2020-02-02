package myTestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import Reporting.Report_Setup;
import Utilities.Common_Functions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="features",
		glue="stepDefination",
		format={"pretty","html:src/test/resources/test-output","json:src/test/resources/json-output/cucumber.json","junit:src/test/resources/junit-xml-output/cucumber.xml"},
		//dryRun=true,
		monochrome=true,
		strict=false
		// there r 3 formats that generate uisng junit 1.html,2. xml,3. json 
		
		)
public class TestRunner 
{
	
	
}
