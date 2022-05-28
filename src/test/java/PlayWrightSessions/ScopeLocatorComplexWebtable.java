package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScopeLocatorComplexWebtable {

	public static void main(String[] args) {


		Playwright playwright = Playwright.create();
		
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	              Page page=  browser.newPage();
	              page.navigate("https://datatables.net/extensions/select/examples/initialisation/checkbox");
	              //1
	             Locator row = page.locator("table#example tr");
	             
	           row.locator(":scope", new Locator.LocatorOptions().setHasText("Ashton Cox")).
	           locator(".select-checkbox").click();
	           
        row.locator(":scope").allInnerTexts().forEach(e->System.out.println(e));
	}

}
