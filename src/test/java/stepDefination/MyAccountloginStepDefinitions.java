package stepDefination;

import org.junit.Assert;


import org.openqa.selenium.By;
import Utilities.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Reporting.Extent_Reporting;
import Reporting.Report_Setup;
import Utilities.Common_Functions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyAccountloginStepDefinitions 
{
	public   WebDriver driver;
	public static 	Common_Functions commonFunctions;
	/*@Before("@First")
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
	@After("@First")
	public void teardown() throws Exception
	{
		Report_Setup.extent.endTest(Report_Setup.test);
		Report_Setup.extent.flush();
		commonFunctions.stopRecording();
	}
	//public static WebDriver driver;
	*/
	
	@Given("^open browser$")
	public void open_browser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		/*Report_Setup.InitializeReport();
		common.startRecording();
		
		driver.manage().window().maximize();*/
	  
	}

	@When("^Enter url \"([^\"]*)\"$")
	public void enter_url(String arg1) throws Throwable 
	{
		driver.get("http://practice.automationtesting.in/");
	  
	}

	@And("^click on My Account menu$")
	public void click_on_My_Account_menu() throws Throwable 
	{
	   driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	}

	@And("^Registered username and password$")
	public void registered_username_and_password() throws Throwable 
	{
		driver.findElement(By.xpath("//label[@for='username']/following::input[@id='username']")).sendKeys("softengertesting@gmail.com");
		//Extent_Reporting.Log_Pass("zdkjfhsdjkg", "shsijkt");
		//Common_Functions.captureScreenshot(driver);
		
		//Extent_Reporting.Log_Pass("test", "test");
		
	Extent_Reporting.Log_Pass_with_Screenshot("login", "entered username", driver);
	
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//label[@for='username']/following::input[@id='password']")).sendKeys("SoftengerPs11184490");
		Extent_Reporting.Log_Pass_with_Screenshot("login", "entered password", driver);
		Common_Functions.captureScreenshot(driver);
	}

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@Then("^user must sucessfully login to application$")
	public void user_must_sucessfully_login_to_application() throws Throwable {
	   String capturetext=driver.findElement(By.xpath("//strong[contains(text(),'softengertesting')]")).getText();
	 Extent_Reporting.Log_Pass_with_Screenshot("login", "sucessfully", driver);
	  // Assert.assertEquals(true, capturetext.contains("softengertesting"));
	   System.out.println("verified login ");
	  /* Report_Setup.extent.endTest(Report_Setup.test);
		Report_Setup.extent.flush();
	   common.stopRecording();*/
	}



}
