package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class XpathLocator {
public static Page page;
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		 LaunchOptions lp = new LaunchOptions();
		 lp.setChannel("chrome");
		 lp.setHeadless(false);
		 
		Browser browser =playwright.chromium().launch(lp);
              
		page = browser.newPage();
            
            page.navigate("https://selectorshub.com/xpath-practice-page/");
            page.locator("xpath=//tagname[@attribute ='value']");
            page.locator("//tagname[@attribute ='value']");

	}

}
