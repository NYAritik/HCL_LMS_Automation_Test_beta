package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LMS_Login {

	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement username;

	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"loginbtn\"]")
	WebElement Loginbtn;
	
	@FindBy(xpath="//*[@id=\"region-main\"]/div[2]/div/div/div/div[1]/div")
	WebElement invldlgnmsg;

	WebDriver driver;
	public LMS_Login (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver ,this);


	}

	public void username1() {

		username.sendKeys("pltechbee0821005");

	}

	public void password1() {

		password.sendKeys("P@ssword12");

	}

	public void password2() {

		password.sendKeys("P@ssw0rd");

	}
	
	public void loginbtn1() {
		
		Loginbtn.click();
	}
	

	
	public boolean invalidlgn1() {
		return invldlgnmsg.getText().equals("Invalid login, please try again");
		
	}

}
