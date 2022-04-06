package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LMS_java_course {

	@FindBy(xpath="//a[@class = 'clickable' and text() = 'TERM 1 - Module 1: Basic ...' ]")
	WebElement termbtn;
	
	@FindBy(xpath="//h2[@class = 'title']")
	WebElement java_heading;

	//	@FindBy(xpath="//a[text() = 'Topic 1: Introduction to ...']")
	//	WebElement subtopics;

	//	@FindBy(xpath="//*[@id=\"section-outline-2\"]/a")
	//	WebElement topic_1;

	@FindBy(partialLinkText="Topic 1: Introduction to ...")
	WebElement topic_1;

	@FindBy(linkText="Topic 2: Basic Elements o...")
	WebElement topic_2;
	
	@FindBy(xpath = "//*[@id=\"yui_3_17_2_1_1649211219227_44\"]/p[1]")
	WebElement lrnobj;

	WebDriver driver;
	public LMS_java_course (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver ,this);

	}

	public void windowhndlr() {

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}


		//		Set<String> s1=driver.getWindowHandles();
		//		Iterator<String> i1=s1.iterator();
		//		String child=i1.next();	
		//		//driver.switchTo().window(child);
	}

	//	public void hndle() {
	//		driver.switchTo().window(child);
	//	}


	public void btn_term_1() {
		termbtn.click();

	}

//	public void txt_topic_1() {
//		topic_1.click();
//	}
//	
//	public void txt_topic_2 () {
//		topic_2.click();
//	}

		public boolean txt_topic_1_and_2() {
			return topic_1.isDisplayed() && topic_2.isDisplayed();
			
		}

		public void link_topic_1() {
			topic_1.click();
	
		}
		
		public boolean lrnobjtv() {
			return lrnobj.isDisplayed();
			
		}


		public boolean java_head_1() {
			return java_heading.isDisplayed();
		}
		
//		public void print() {
//			System.out.println(java_heading.getText());
//		}
		
		

	//	public void windowhndle() {
	//		//Get handles of the windows
	//	       String mainWindowHandle = driver.getWindowHandle();
	//	       Set<String> allWindowHandles = driver.getWindowHandles();
	//	       Iterator<String> iterator = allWindowHandles.iterator();
	//	       
	//	       
	//	       // Here we will check if child window has other child windows and will fetch the heading of the child window
	//	       while (iterator.hasNext()) {
	//	           String ChildWindow = iterator.next();
	//	               if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	//	               driver.switchTo().window(ChildWindow);
	//	               }
	//	       }
	//	}

}
