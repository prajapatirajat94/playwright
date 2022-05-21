package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class ComaSelectors {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		
		  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		    //  Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		
		      page.navigate("https://academy.naveenautomationlabs.com/#");
//		      page.locator("a:has-text('Login'), "
//		      		+ "span:has-text('Login')").click();
		      Locator impele= page.locator("span:has-text('Store'), a:has-text('Login')");
		      System.out.println(impele.count());
		      
		      if(impele.count() ==2) {
		    	  System.out.println("Pass");
		      }
		      else {
		    	  System.out.println("Fail");
		      }
		      
		
	}

}
