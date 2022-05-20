package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelectors {

	public static void main(String[] args) {
		
	Playwright playwright = Playwright.create();
	Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
          Page page=browser.newPage(); 
          page.navigate("https://demo.opencart.com/index.php?route=account/login");
         // page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
         // 1.single elements 
        //page.locator("text=Contact Sales").click();
          //2.Multiple elements 
//       Locator links =   page.locator("text=Privacy Policy");
//     System.out.println(links.count());       
//        for(int i=0;i<links.count();i++) {
//  String policy=links.nth(i).textContent();
//  if(policy.contains("Service Privacy Policy")) {
//	  links.nth(i).click();
//	  break;
//  }
//        }
//    3.With Has text    
     String header =  page.locator("div.well h2:has-text('New Customer')").textContent(); 
     System.out.println(header);
    String pageheader = page.locator("'Your Store'").textContent();
   // with  xpath
     //String pageheader = page.locator("xpath=//a[text()='Your Store']").textContent();
   //a[text()="Your Store"]
     System.out.println(pageheader);
	}

}
