package PlayWrightSessions;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.FilePayload;

public class FileUploadHandle {

	public static void main(String[] args) throws InterruptedException {
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	          Page page=browser.newPage(); 
	          
	       page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");		  
//	          page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");	
	          //single files
//	          page.setInputFiles("input#filesToUpload", Paths.get("appLogin.json"));//upload file
//	          Thread.sleep(4000);
//	          
//	          page.setInputFiles("input#filesToUpload", new Path[0]);//dettach file	          
//	          
	          //Multiple files 
//	          page.setInputFiles("input#filesToUpload", new Path[] {
//	        		                                         Paths.get("appLogin.json"),
//	        		                                         Paths.get("appLogin.json"),
//	        		                                         Paths.get("appLogin.json")});
//	          Thread.sleep(4000);
//	          
//	          page.setInputFiles("input#filesToUpload", new Path[0]);
	          //Run time create file and upload 
//	          page.setInputFiles("input#filesToUpload", new FilePayload("Rajat.text", "text/plain"
//	        		             , "This is Rajat here".getBytes(StandardCharsets.UTF_8)));
	       page.setInputFiles("input[name='upfile']", new FilePayload("Rajat.text", "text/plain"
		             , "This is Rajat here".getBytes(StandardCharsets.UTF_8)));
	       page.locator("input[value='Press']").click();
	}
}
