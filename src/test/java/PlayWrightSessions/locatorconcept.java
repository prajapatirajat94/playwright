package PlayWrightSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class locatorconcept {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		//locators
		BrowserContext brox1 =browser.newContext();
		Page page =brox1.newPage();
	    //page.navigate("https://academy.naveenautomationlabs.com/");
		page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
	//Single elements->
		// Locator contactsales=page.locator("text=CONTACT SALES");
		// contactsales.hover(); 
		// contactsales.click();
		// Locator loginbtn=page.locator("text=Login");
	    // int totalcnt =loginbtn.count();
	   //  System.out.println(totalcnt);
	   //  loginbtn.first().click();

	     /*loginbtn.hover(); 
		 loginbtn.click();
		 */	     
	//Multiple Element-> Iteration from mulultiple element usinf FOR loop
	//Locator countryoptions = page.locator("select#Form_submitForm_Country option");
		Locator countryoptions = page.locator("xpath=//a");
	     System.out.println(countryoptions.count());  
	     for(int i=1;i<countryoptions.count();i++) {
	     String text =countryoptions.nth(i).textContent();
	     System.out.println(text);
	    }
	  List<String>CS =  countryoptions.allTextContents();
	 // countryoptions.allInnerTexts();
	//         for(String e :CS) {
	 //       	 System.out.println(e);
	//         }
	// CS.forEach(e -> System.out.println(e));
	     
	}

}
