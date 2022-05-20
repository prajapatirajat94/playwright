package PlayWrightSessions;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VisibleElements {

	public static void main(String[] args) {


		Playwright playwright = Playwright.create();
		 
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                 Page page = browser.newPage();
                 
                 //button:visible
                 //button >> visible=true
             page.navigate("https://www.amazon.ca/");
            // page.locator("button:visible").textContent();
             List<String>links=page.locator("a:visible").allInnerTexts();
             for(int i=0;i<links.size();i++) {
            	System.out.println(links.get(i));       	
             }
         // with x path 
           int imgcnt=  page.locator("xpath=//img >> visible=true").count();
           System.out.println(imgcnt);
             
	}

}
