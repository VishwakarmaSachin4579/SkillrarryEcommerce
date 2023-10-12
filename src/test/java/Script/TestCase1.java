package Script;

import org.testng.annotations.Test;

import POM.DemoSkillRarryAppPage;
import POM.SkillrarryHomepage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() throws Throwable {
		SkillrarryHomepage s = new SkillrarryHomepage(driver);
		s.gearsbutton();
		s.skillrarrydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillRarryAppPage dS = new DemoSkillRarryAppPage(driver);
		utilities.dropDowns(dS.getselectDd(), pdata.getpropertyData("coursedd"));
		TestingPage tP = new TestingPage(driver);
		utilities.scrollBar(driver, tP.getFbIcon());
		tP.fbIconWebElement();
	}

}
