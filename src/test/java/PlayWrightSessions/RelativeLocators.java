package PlayWrightSessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RelativeLocators {
static Page page;
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		 LaunchOptions lp = new LaunchOptions();
		 lp.setChannel("chrome");
		 lp.setHeadless(false);
		 
		Browser browser =playwright.chromium().launch(lp);
               
		page = browser.newPage();
             
             page.navigate("https://selectorshub.com/xpath-practice-page/");
            //1.:Left-of  
           //  page.locator("input[type='checkbox']:left-of(:text('Joe.Root'))").first().click();
          selectuser("Jasmine.Morgan");
             selectuser("John.Smith");
           //2. :Right-of 
            //String userrole= page.locator("td:right-of(:text('Joe.Root'))").first().textContent();
          // System.out.println(role("John.smith"));
            //3.Above
           String aboveuser= page.locator("td:above(:text('Joe.Root'))").first().textContent();
           System.out.println(aboveuser);
            //4.Below
             String belowuser= page.locator("td:below(:text('Joe.Root'))").first().textContent();
              System.out.println(belowuser);
           //5.near
//             Locator nearelements= page.locator("td:near(:text('Joe.Root'),400)");
//            List<String>nearel =nearelements.allInnerTexts();
//            nearel.stream().forEach(e->System.out.println(e));
	}
	
	
	public static void selectuser(String username) {
	page.locator("input[type='checkbox']:left-of(:text('"+username+"'))").first().click();
	}
	public static String role(String username) {
		String userrole= page.locator("td:right-of(:text('"+username+"'))").first().textContent();
        return userrole;
		}

}
