package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class XpathUnion {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		    //  Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		
		      page.navigate("https://academy.naveenautomationlabs.com/#");
                 //
		      page.locator("//a[text()='Login']  |  //span[text()='signin']").click();
		      
	}

}
