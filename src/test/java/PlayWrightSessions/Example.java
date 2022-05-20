package PlayWrightSessions;


	import com.microsoft.playwright.*;
	
	public class Example {
	  public static void main(String[] args) {
		  System.out.println("*-----------------Program Start-----------------*");
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      // Open new page
	      Page page = context.newPage();
	      // Go to https://academy.naveenautomationlabs.com/
	      page.navigate("https://academy.naveenautomationlabs.com/");
	      // Click text=Login
	      page.click("text=Login");
	      // Click button:has-text("Sign Up")
	      page.click("button:has-text(\"Sign Up\")");
	      //pause the screen and open the recorder 
	      page.pause();
	      // Click [placeholder="Name"]
	      page.click("[placeholder=\"Name\"]");
	      // Fill [placeholder="Name"]
	      page.fill("[placeholder=\"Name\"]", "Rajatkumar Prajapati");
	      // Press Tab
	      page.press("[placeholder=\"Name\"]", "Tab");
	      // Fill [placeholder="Email"]
	      page.fill("[placeholder=\"Email\"]", "prajapatirajat94@gmail.com");
	      // Press Tab
	      page.press("[placeholder=\"Email\"]", "Tab");
	      // Fill [placeholder="Create Password"]
	      page.fill("[placeholder=\"Create Password\"]", "rsting123");
	      // Press Tab
	      page.press("[placeholder=\"Create Password\"]", "Tab");
	      // Click .iti-arrow
	      page.click(".iti-arrow");
	      // Click :nth-match(:text("India (भारत)"), 2)
	      page.click(":nth-match(:text(\"India (भारत)\"), 2)");
	      // Click [placeholder="Mobile"]
	      page.click("[placeholder=\"Mobile\"]");
	      // Fill [placeholder="Mobile"]
	      page.fill("[placeholder=\"Mobile\"]", "3068072515");
	      // Click #loginFormHtml div [aria-label="Close"]
	      page.click("#loginFormHtml div [aria-label=\"Close\"]");
	      System.out.println("*-----------------Program end-----------------*");
	    }}}
