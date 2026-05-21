package play1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {
	public static void main(String[] args) {
		Playwright.create();
		Playwright playwright =Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.google.com/");
		String title=page.title();
		System.out.println(title);
		page.locator("#APjFqb").fill("Playwright");
		//page.close();
		//browser.close();
		//playwright.close();
		
		
	}

}
