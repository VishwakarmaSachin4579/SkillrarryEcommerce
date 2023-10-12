package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// url is https://demoapp.skillrary.com/category.php?category=testing
public class TestingPage {
    // Declaration 
	
	// address of facebook Web element 
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon ;
		
	
	//initilization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	//utilization
	
	public void fbIconWebElement() {
		fbIcon.click();
	}
	public WebElement getFbIcon() {
		return fbIcon;
		
	}

}
