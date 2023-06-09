package ProjectPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Test;

public class ProjectWright {
    @Test
    public void Login() throws InterruptedException {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser browser = playwright.chromium().launch(lp);
        Page page = browser.newPage();
        page.navigate("https://edge.k8s.g498.io/admin/login");
        String title = page.title();
        System.out.println("Title of this page is " + title);
        String url = page.url();
        System.out.println("Url Is " + url);
        page.type("[id=\"username\"]", "username");
        page.type("[id=\"password\"]", "sn0rkeLFLOW!");
        page.click("[data-cy=\"login-button\"]");
        Thread.sleep(5000);

    }
//
    }





    // browser.close();
       // playwright.close();




