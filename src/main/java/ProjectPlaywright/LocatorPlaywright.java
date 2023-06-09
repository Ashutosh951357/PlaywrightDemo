package ProjectPlaywright;

import com.microsoft.playwright.*;

public class LocatorPlaywright {
    public static void main(String[] args) {
        Playwright playwright=Playwright.create();
        Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext =browser.newContext();
        Page page=browserContext.newPage();
        page.navigate("https://www.orangehrm.com/");
        Locator pageContact =page.locator("text=Contact Sales");
        // pageContact.hover();
        pageContact.click();


    }
}
