package PlayWrightSessions;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUploadHandle {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	          Page page=browser.newPage(); 
	          page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");	
	          //single files
//	          page.setInputFiles("input#filesToUpload", Paths.get("appLogin.json"));//upload file
//	          Thread.sleep(4000);
//	          
//	          page.setInputFiles("input#filesToUpload", new Path[0]);//dettach file	          
//	          
	          //Multiple files 
	          page.setInputFiles("input#filesToUpload", new Path[] {
	        		                                         Paths.get("appLogin.json"),
	        		                                         Paths.get("appLogin.json"),
	        		                                         Paths.get("appLogin.json")});
	          

	}
}
