package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LMS_Feedback {
	
	@FindBy(xpath="//*[@id=\"bif\"]/p[2]")
	WebElement batch_id;
	
	@FindBy(xpath="//*[@id=\"trn\"]")
	WebElement dropdown;

	WebDriver driver;
	public LMS_Feedback (WebDriver driver){
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
	}
	
	public boolean get_batch_id() {
		return batch_id.isDisplayed();
	}
	
	public Boolean trainer() {
		Select S_option = new Select(dropdown);
		S_option.selectByValue("Rashi");
		WebElement w = S_option.getFirstSelectedOption();
		Boolean Name = w.isSelected();
		return Name;
	}
	
	
}
