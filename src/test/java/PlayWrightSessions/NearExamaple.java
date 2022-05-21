package PlayWrightSessions;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NearExamaple {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                         Page page=browser.newPage();
                         page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
                // page.locator("input:below(#Form_submitForm_subdomain)").first().fill("Rajatkumar");
                 page.locator("input:below(label:text('Full Name'))").first().fill("Rajatkumar");
                page.locator("input:below(label:text('Email'))").first().fill("Rajatkumar");
                page.locator("input:below(label:text('Phone Number'))").first().fill("1234567890");
               // page.selectOption("select#Form_submitForm_Country", "India");
               List<String> country=page.locator("select#Form_submitForm_Country option").allInnerTexts();
               country.stream().forEach(e->System.out.println(e));
             
	}

}
