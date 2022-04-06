package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.LMS_Dashboard;
import pages.LMS_java_course;
import pages.LMS_Login;
import pages.LMS_Feedback;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LMS_Feedback_test {

	public class logintest {

		static WebDriver driver;
		static LMS_Login objLogin;
		static LMS_Dashboard objdashbrd;
		static LMS_Feedback objfeedback;
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

			//			Set<String> s1=driver.getWindowHandles();
			//			Iterator<String> i1=s1.iterator();
			//			String child=i1.next();

		}

		@AfterTest

		public void teardown() {
			//driver.close();
			extent.flush();

		}



		@SuppressWarnings("deprecation")

		@Test(priority = 0)
		public void feedback_funtionality() throws InterruptedException {



			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ExtentTest test = extent.createTest("Batch ID is Visible", "Different case senarios");
			objLogin = new LMS_Login(driver);
			objdashbrd = new LMS_Dashboard(driver);
			objfeedback = new LMS_Feedback(driver);
			objLogin.username1();
			objLogin.password2();
			objLogin.loginbtn1();
			objdashbrd.link_fdbck1();
			objfeedback.windowhndlr();
			Assert.assertTrue(objfeedback.get_batch_id(), "Failed TestID..."); {
				test.log(Status.PASS, "Batch ID Displayed");
			}

		}
		
		@Test(priority = 1)
		public void T_dropdown_funtionality() throws InterruptedException {



			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ExtentTest test = extent.createTest("Trainer name selected", "Different case senarios");
//			objLogin = new LMS_Login(driver);
//			objdashbrd = new LMS_Dashboard(driver);
//			objfeedback = new LMS_Feedback(driver);
//			objLogin.username1();
//			objLogin.password2();
//			objLogin.loginbtn1();
//			objdashbrd.link_fdbck1();
//			objfeedback.windowhndlr();
//			objfeedback.trainer();
			Assert.assertTrue(objfeedback.trainer(), "Failed TestID..."); {
				test.log(Status.PASS, "Name Selected");
			}

		}

	}
}
