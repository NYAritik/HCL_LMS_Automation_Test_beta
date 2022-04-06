package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LMS_Dashboard;
import pages.LMS_Login;

//import pages.javacoursepg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LMS_Login_test {

	static WebDriver driver;
	static LMS_Login objLogin;
	static LMS_Dashboard objdashbrd;
	//	static LMS_java_course objjvcoursepg;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	public static void main(String[] args) {

	}
	@BeforeTest
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("Login_functionality.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hcltss-lms.com/login/index.php");


	}

	@AfterTest

	public void teardown() {
		//driver.close();
		extent.flush();

	}

	@Test
	public void Login_functionality() throws Exception {
		ExtentTest test = extent.createTest("Login Succesfully", "Different case senarios");
		objLogin = new LMS_Login(driver);
		objdashbrd = new LMS_Dashboard(driver);		
		objLogin.username1();
		objLogin.password2();
		objLogin.loginbtn1();
		Assert.assertTrue(objdashbrd.dashboard1(),"Failed test2"); {
			test.log(Status.PASS, "Login Succesfully");
		}
	}

	@Test
	public void Invalid_Login_functionality() throws Exception {
		ExtentTest test = extent.createTest("Invalid Login", "Different case senarios");
		objLogin = new LMS_Login(driver);
		objdashbrd = new LMS_Dashboard(driver);
		objLogin.username1();
		objLogin.password1();
		objLogin.loginbtn1();
		Assert.assertTrue(objLogin.invalidlgn1(),"Failed test1"); {
			test.log(Status.PASS, "Invalid Login");
		}

	}

}
