package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LMS_Dashboard {
	@FindBy(xpath="//*[@id=\"region-main\"]/div/div/div/div[1]/div/h2")
	WebElement dashboard;
	
	@FindBy(xpath="//*[@id=\"region-main\"]/div/div/div/div[2]/div[3]/div[3]/div/div/a")
	WebElement text_java;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	WebElement link_fdbck;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a")
	WebElement link_scorecrd;
	
	WebDriver driver;
	public LMS_Dashboard (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver ,this);
		
	}
	
	public boolean dashboard1() {
		return dashboard.getText().equals("Learner Dashboard");
		
	}
	
	public void txtjava() {
		text_java.click();
		
	}
	
	public void link_fdbck1() {
		link_fdbck.click();
	}
	
	public void link_score() {
		link_scorecrd.click();
	}

}
