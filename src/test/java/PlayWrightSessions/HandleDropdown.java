package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class HandleDropdown {

	public static void main(String[] args) {
Playwright playwright= Playwright.create();
		
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		
		Browser browser =playwright.chromium().launch(lp);
		
		Page page =browser.newPage();
		 page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		page.selectOption("//*[@name='Country']", "India");
	}

}
