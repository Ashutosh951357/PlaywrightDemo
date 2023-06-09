package ProjectPlaywright;

import com.microsoft.playwright.*;

public class Tracerinspection {
    public static void main(String[] args) {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brcx1 =browser.newContext();
        Page p1=brcx1.newPage();
        p1.navigate("https://www.orangehrm.com/");

        Playwright playwright1=Playwright.create();
        Browser browser1=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brcx2 =browser.newContext();
        Page p2=brcx2.newPage();
        p1.navigate("https://mail.google.com/mail/u/0/#inbox");


    }

}
