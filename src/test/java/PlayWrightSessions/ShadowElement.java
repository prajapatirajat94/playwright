package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowElement {

	public static void main(String[] args) {


	Playwright playwright = Playwright.create();
	
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
              Page page=  browser.newPage();
              page.navigate("https://selectorshub.com/xpath-practice-page/");
         //     page.navigate("https://books-pwakit.appspot.com/");
       // 1. Page --DOM --> Shadow DOM --> elements      
		
//		  page.locator("book-app[apptitle='BOOKS'] #input").fill("Testing Rajat");
//		  String txt=
//		  page.locator("book-home[class='_page'] div.books-desc").textContent();
//		  System.out.println(txt);
		 
        // 2. Page --DOM --> iframe--> Shadow DOM --> elements  
        page.frameLocator("#pact").locator("div#snacktime #tea").fill("I love tea");    
        
	}
	

}
