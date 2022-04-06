package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.LMS_Dashboard;
import pages.LMS_java_course;
import pages.LMS_Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LMS_Content_test {

	public class logintest {

		static WebDriver driver;
		static LMS_Login objLogin;
		static LMS_Dashboard objdashbrd;
		static LMS_java_course objjvcoursepg;
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

		@Test
		public void openjavacourse_funtionality() throws InterruptedException {



			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			ExtentTest test = extent.createTest("Content is Visible!!!", "Different case senarios");
//			objLogin = new LMS_Login(driver);
//			objdashbrd = new LMS_Dashboard(driver);
//			objjvcoursepg = new LMS_java_course(driver);
//			objLogin.username1();
//			objLogin.password2();
//			objLogin.loginbtn1();
//			objdashbrd.txtjava();
//			//Thread.sleep(4000);
//
//			//			Set<String> s1=driver.getWindowHandles();
//			//			Iterator<String> i1=s1.iterator();
//			//			String child=i1.next();
//			objjvcoursepg.windowhndlr();
//			//driver.switchTo().window(child);
//
//			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//			//driver.navigate().to("https://www.hcltss-lms.com/course/view.php?id=11110");
//			//driver.switchTo().window("https://www.hcltss-lms.com/course/view.php?id=11110");

			objjvcoursepg.btn_term_1();
			Assert.assertTrue(objjvcoursepg.txt_topic_1_and_2(),"Failed TESTID ---"); {
				test.log(Status.PASS, "Topic not Display");
			}


		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void java_page_open () {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			ExtentTest test = extent.createTest("Java Page Opened Successfully", "Different case senarios");
			objLogin = new LMS_Login(driver);
			objdashbrd = new LMS_Dashboard(driver);
			objjvcoursepg = new LMS_java_course(driver);
			objLogin.username1();
			objLogin.password2();
			objLogin.loginbtn1();
			objdashbrd.txtjava();
			objjvcoursepg.windowhndlr();
//			objjvcoursepg.print();
			Assert.assertTrue(objjvcoursepg.java_head_1(), "Failed TestID..."); {
				test.log(Status.PASS, "Java Page not opened");
			}

		}

	}
}
