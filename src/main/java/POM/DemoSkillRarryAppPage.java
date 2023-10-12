package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillRarryAppPage {
	
	//Declaration
	//address of course web element 
	@FindBy(id="course")
	private WebElement Coursebtn;
	
	//address of feedback web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackBtn;
	
	//address of select category drop down
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//initilization
	public DemoSkillRarryAppPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	
	//Utilization
	
     public WebElement getCoursebtn() {
		return Coursebtn;
    	 
     }
     
     public WebElement getselectDd() {
 		return selectDd;
     }
     
    public void feedBackButton() {
    	feedBackBtn.click();
    }
     

}
