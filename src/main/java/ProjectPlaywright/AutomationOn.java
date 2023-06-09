package ProjectPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

//import com.microsoft.playwright.*;
public class AutomationOn {


           public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                Page page = browser.newPage();
               // page.navigate("https://edge.k8s.g498.io/");
                 page.navigate("https://www.wikipedia.org/");
               // page.navigate("http://playwright.dev");
                System.out.println(page.title());
                page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Ashutosh.jpg")));

            }
        }
    }

