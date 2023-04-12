package PlayWrightSessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ReactElement {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      // Open new page
		      Page page = context.newPage();
		      page.navigate("https://www.netflix.com/ca/");
		     Locator email = page.locator("_react=p[name='email'] >> input").first();
		      
		    // email.click();
		     email.fill("Prajapatirajat94@gmail.com");
		     Locator footer = page.locator("_react=UIMarkup[data-uia ='data-uia-footer-label']");
		     List<String>footerlist = footer.allInnerTexts();
		     for(String e:footerlist) {
		    	 System.out.println(e);
		     }
		     Locator language = page.locator("_react=UISelect[data-uia='language-picker']").first();
		     language.click();
	}

}
