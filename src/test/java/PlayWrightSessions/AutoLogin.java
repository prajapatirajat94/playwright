package PlayWrightSessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserContext.StorageStateOptions;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoLogin {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 BrowserContext brcontext    =    browser.newContext();
	       Page page=brcontext.newPage(); 
	       page.navigate("http://automationpractice.com/");
	       page.locator("a:text('Sign in')").click();
	       page.fill("#email", "prajapatirajat94@gmail.com");
	       page.fill("#passwd", "Rsting@1234");
	       page.click("#SubmitLogin");
	       
	       brcontext.
	       storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("appLogin.json")));
	       
	}

}
