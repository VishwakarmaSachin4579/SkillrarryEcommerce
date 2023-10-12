package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// url is  https://www.skillrary.com/
public class SkillrarryHomepage {
	//Declaration
	// address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;

	//address of skillrarry demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarrydemoapp;

	//address of search text field
	@FindBy(xpath="(//input [@name='q']")
	private WebElement searchTf;

	//address of search icon
	@FindBy(xpath="(//input [@value='go']")
	private WebElement searchicon;

	//address of coockie cross icon
	@FindBy(xpath="(//a[@class='class_cookies']")
	private WebElement coockies;

	
	//initilization
	
	public SkillrarryHomepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	//utilization
	public void gearsbutton() {
		gearsbtn.click();
	}

	public void skillrarrydemoapplink() {
		skillrarrydemoapp.click();
	}

	public void searchTextfield(String data) {
		searchTf.sendKeys(data);
	}
	
	public void searchIcon(String data) {
		searchicon.click();
	}
	
	public void coockiesIcon(String data) {
		coockies.click();
	}
}
