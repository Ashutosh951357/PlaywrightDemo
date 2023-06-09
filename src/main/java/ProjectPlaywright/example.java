package ProjectPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class example {

    public static void main(String[] args) {
        // Create a new browser instance.
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        // Create a new page.
        Page page =  browser.newPage();

        // Maximize the window.
          page.setViewportSize(1920,1080);

        // Go to a website.
         page.navigate("https://www.google.com");

        // Do something on the website.
         page.click("input[name='q']");
         page.type("input[name='q']", "Bard");
         page.click("Enter");

        // Close the browser.
         browser.close();
    }

}


