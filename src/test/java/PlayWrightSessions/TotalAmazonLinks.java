package PlayWrightSessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TotalAmazonLinks {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
	   Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	   
	   Page page=browser.newPage();
	   page.navigate("https://www.amazon.com/");
	  // List<String>links =page.locator("//a[contains(text(),'Amazon')]").allInnerTexts();
	  // List<String>links =page.locator("xpath=//a[contains(text(),'Amazon')]").allInnerTexts();
	   List<String>links =page.locator("a:has-text('Amazon')").allInnerTexts();
           links.stream().forEach(e ->System.out.println(e));  
         Locator  link =page.locator("a:has-text('Amazon')");
          for(int i=0;i<link.count();i++) {
        	  System.out.println(link.nth(i).getAttribute("href"));
          }
	}

}
