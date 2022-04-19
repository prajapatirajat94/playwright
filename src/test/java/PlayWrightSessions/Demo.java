package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Demo {

	public static void main(String[] args) {

	//run this command in terminal 
    //add maven compiler plugin in pom.xml file
	//mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="codegen wikipedia.org" 	
	//This command we can run and open recorder 	
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser = playwright.chromium().launch(lp);
		 // Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		    //  Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		
		      page.navigate("http://playwright.dev");
		      System.out.println(page.title());
		     
		      browser.close();
		      playwright.close();

	}

}
