package PlayWrightSessions;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class DownloadFile {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		              Page page =browser.newPage();
		              page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.61/");
              Download download= page.waitForDownload(()-> {
             page.click("a:text('chromedriver_mac64.zip')");
               });
               System.out.println(download.url());
      //         System.out.println(download.page().title());
                System.out.println(download.page().toString());
                download.saveAs(Paths.get("Rajat_chrome.zip"));
//      download.cancel();
//      download.failure();
                
	}

}
