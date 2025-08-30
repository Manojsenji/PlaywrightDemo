package PlaywrightDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class LoginAndLogout extends PlaywrightBasics{
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;



    @Test
    public void testLoginAndLogout() {
        page.navigate("https://dev.ashurityhealth.com/login");

        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Your Username")).fill("manoj");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Your Password")).fill("Ashurity@123");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("ROC")).check();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Proceed")).click();
        page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Profile")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Logout")).click();
    }


}
