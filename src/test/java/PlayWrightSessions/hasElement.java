package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.MouseButton;

public class hasElement {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		 
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                 Page page = browser.newPage();
             //    page.navigate("https://www.amazon.com/");    
             page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
             Locator loc =page.locator("select#Form_submitForm_Country:has(option[value='India'])");
             loc.allInnerTexts().forEach(e ->System.out.println(e));
		
	//	page.click("select#Form_submitForm_Country:has(option[value='India'])", new Page.ClickOptions().setButton(MouseButton.RIGHT));
//	Locator footerlist = page.locator("div.navFooterLinkCol:has(a[href='https://www.amazon.jobs'])");
//	footerlist.allInnerTexts().forEach(e ->System.out.println(e));
	}

}
