package Script;

import org.testng.annotations.Test;

import POM.DemoSkillRarryAppPage;
import POM.InvoicePage;
import POM.SkillrarryHomepage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {
		SkillrarryHomepage s = new SkillrarryHomepage(driver);
		s.gearsbutton();
		s.skillrarrydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillRarryAppPage dS =new DemoSkillRarryAppPage(driver);
		dS.feedBackButton();
		InvoicePage iP = new InvoicePage(driver);
		iP.InvoiceButton();
	}

}
