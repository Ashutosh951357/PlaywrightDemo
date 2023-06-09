import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class snorkelProject {
    @Test
    public Page snorkel() throws InterruptedException {
        Playwright playwright = Playwright.create();
        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setScreenSize(1920, 1080));
            Page page = browser.newPage();
            page.setViewportSize(1920,1080);
            page.navigate("https://edge.k8s.g498.io/");
            
            System.out.println(page.title());
            String url = page.url();
            System.out.println("Url Is " + url);
            page.type("[id=\"username\"]", "username");
            page.type("[id=\"password\"]", "sn0rkeLFLOW!");
            page.click("[data-cy=\"login-button\"]");
            Thread.sleep(9000);
//            page.locator("[data-cy=\"stacked-button-wrapper\"]").click();
//            Thread.sleep(6000);
            return page;
        }

    }
    @Test
    public void createApplication() throws InterruptedException {
        Page page=snorkel();
        page.locator("[data-cy=\"stacked-expand-button\"]").click();
        Thread.sleep(3000);
        page.locator("[data-cy=\"new-application-from-preset-button\"]").click();
        Thread.sleep(9000);
        page.locator("[data-cy=\"input-wrapper\"]").click();
        Thread.sleep(5000);
      //  page.locator("[data-cy=\"application-template-card-[demo]-seq-tag-company-financial-news_q2-2022]").click();
     //   Thread.sleep(6000);

    }
}
