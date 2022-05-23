package PlayWrightSessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JsPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	          Page page=browser.newPage(); 
	          page.onDialog(dialoge -> {
	        	  String text =dialoge.message();
	        	  System.out.println(text);
	        	  dialoge.accept("this is my alert");
//	        	  dialoge.dismiss();
	          });
	    // JS Alerts, Prompt, Confirmation pop ups    
	         page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
	         page.click("//button[text()='Click for JS Alert']");
	         String result =page.textContent("#result");
	         System.out.println(result);
	         Thread.sleep(1500);
	         page.click("//button[text()='Click for JS Confirm']");
	          result =page.textContent("#result");
	         System.out.println(result);
	         Thread.sleep(1500);
	         page.click("//button[text()='Click for JS Prompt']");
	         Thread.sleep(1500);
	     result =page.textContent("#result");
	         System.out.println(result);
               
	         page.close();
	         browser.close();
	         playwright.close();
	}

}
