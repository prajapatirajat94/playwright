package PlayWrightSessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoLogin2 {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 BrowserContext brcontext =  browser.
				                           newContext(new Browser.NewContextOptions().
				                        		      setStorageStatePath(Paths.get("appLogin.json"))
				                                 );
	       Page page=brcontext.newPage(); 
	       page.navigate("http://automationpractice.com/");
	       
	}

}
