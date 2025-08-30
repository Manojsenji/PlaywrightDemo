package PlaywrightDemo;

import org.testng.annotations.AfterClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {
	public static void main(String[] args)
	{

	Playwright playwright =Playwright.create();

	//Browser browser =playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

	BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions();
	lp.setChannel("chrome");
	lp.setHeadless(false);
	Browser browser = playwright.chromium().launch(lp);
//kjhghfxdghjkl
//	lp.setChannel("msedge");
//	lp.setHeadless(false);
//	Browser browser = playwright.chromium().launch(lp);

//	lp.setChannel("firefox");
//	lp.setHeadless(false);
//	Browser browser = playwright.firefox().launch(lp);

	BrowserContext context = browser.newContext(new Browser.NewContextOptions()
		    .setIgnoreHTTPSErrors(true)); // It will ignore ssl part

	Page page = context.newPage();

	//Page page = browser.newPage();
	page.navigate("https://dev.ashurityhealth.com/login");

	String title = page.title();
	System.out.println("Page title is : " + title);

	String url = page.url();
	System.out.println("URL is : "+url);

	//browser.close();
	}


}