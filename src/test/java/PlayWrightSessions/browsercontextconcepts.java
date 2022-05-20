package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class browsercontextconcepts {

	public static void main (String[]args) {
	
	Playwright playwright = Playwright.create();
	Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	//We can create multiple browsercontext from Browser 
	//#1 browser context
	BrowserContext brox1 =  browser.newContext();
	Page p1 =brox1.newPage();
	p1.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		p1.fill("#Form_submitForm_subdomain", "Rajat");
		System.out.println(p1.title());
    //#2 browser context	
		BrowserContext brox2 =  browser.newContext();
		Page p2 =brox2.newPage();
		p2.navigate("https://automationpractice.com/");
			p2.fill("#search_query_top", "Rajat new page");
			System.out.println(p2.title());	
		
		p1.close();
		brox1.close();
		
		p2.close();
		brox2.close();
			
	}
	
	
}
