package ProjectPlaywright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class snorkelpreset {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://edge.k8s.g498.io/admin/login");

            page.getByLabel("Username").fill("username");

            page.getByLabel("Password").fill("sn0rkeLFLOW!");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
            page.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create from preset")).click();
            page.getByPlaceholder("Search for preset applications").click();
            page.getByPlaceholder("Search for preset applications").fill("contract-classification");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("C Classification contract-classification All industry icon for demo + cypress - Saved on 3/4/2022 04:46 PM")).click();
            page.locator("label").filter(new Locator.FilterOptions().setHasText("Application name")).locator("div").nth(1).click();


            page.getByPlaceholder("dataset-name").fill("contract-classification-dataset-pankaj-23-5");
            page.getByPlaceholder("email-clf-application-graph").click();
            page.getByPlaceholder("email-clf-application-graph").fill("contract-classification-pankaj-23");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            Page page1 = context.newPage();
            page1.navigate("https://edge.k8s.g498.io/");
            page1.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create from preset")).click();
            page1.getByPlaceholder("Search for preset applications").click();
            page1.getByPlaceholder("Search for preset applications").fill("[DEMO] seq-tag-company-financial-news_Q2-2022");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("IE Information Extraction [DEMO] seq-tag-company-financial-news_Q2-2022 All industry icon Official Demo Path for the Summer 2022 release")).click();
            page1.getByPlaceholder("email-clf-application-graph").click();
            page1.getByPlaceholder("email-clf-application-graph").click();
            page1.getByPlaceholder("email-clf-application-graph").click();
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
            page1.getByPlaceholder("email-clf-application-graph").fill("[DEMO] seq-tag-company-financial-news-pankaj-19");
            page1.getByPlaceholder("dataset-name").click();
            page1.getByPlaceholder("dataset-name").click();
            page1.getByPlaceholder("dataset-name").click();
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").press("ArrowRight");
            page1.getByPlaceholder("dataset-name").fill("[DEMO] seq-tag-company-financial-new-pankaj-19");
            page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            Page page2 = context.newPage();
            page2.navigate("https://www.google.com/search?q=edge&oq=edge&aqs=chrome..69i57.1421j0j1&sourceid=chrome&ie=UTF-8");
            page2.close();
            Page page3 = context.newPage();
            page.navigate("https://edge.k8s.g498.io/applications/8263");
            page3.navigate("https://edge.k8s.g498.io/");
            page3.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page3.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page3.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page3.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create from preset")).click();
            page3.getByPlaceholder("Search for preset applications").click();
            page3.getByPlaceholder("Search for preset applications").click();
            page3.getByPlaceholder("Search for preset applications").fill("demo-qa-loan-execution-date");
            page3.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("IE Information Extraction demo-qa-loan-execution-date All industry icon Saved on 6/24/2022 09:54 AM")).click();
            page3.getByPlaceholder("email-clf-application-graph").click();
            page3.getByPlaceholder("email-clf-application-graph").fill("demo-qa-loan-execution-date-pankaj-23");
            page3.getByPlaceholder("dataset-name").click();
            page3.getByPlaceholder("dataset-name").fill("demo-qa-loan-execution-date-dataset-pankaj-23");
            page3.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            Page page4 = context.newPage();
            page4.navigate("https://edge.k8s.g498.io/");
            page4.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page4.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page4.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meNew application")).getByRole(AriaRole.BUTTON).nth(1).click();
            page4.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create from preset")).click();
            page1.navigate("https://edge.k8s.g498.io/applications/8264");
            page4.getByPlaceholder("Search for preset applications").click();
            page4.getByPlaceholder("Search for preset applications").fill("banking-intent-classification-2-27-2023");
            page4.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CA Conversational AI banking-intent-classification-2-27-2023 All industry icon Saved on 2/27/2023 03:43 PM")).click();
            page4.getByPlaceholder("email-clf-application-graph").click();
            page4.getByPlaceholder("email-clf-application-graph").fill("banking-intent-classification-pankaj-23");
            page4.getByPlaceholder("dataset-name").click();
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").press("ArrowRight");
            page4.getByPlaceholder("dataset-name").fill("banking-intent-classification-2-27-2023-dataset-pankaj-23");
            page4.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            page4.navigate("https://edge.k8s.g498.io/applications/8266");
            page.getByText("Expand 3 nodes").click();
            page.locator("div").filter(new Locator.FilterOptions().setHasText("?Model")).first().click();
            page.navigate("https://edge.k8s.g498.io/applications/8263/nodes/39891/studio");
            page.navigate("https://edge.k8s.g498.io/applications/8263/nodes/39891/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&applyPostprocessors=false");
            page.navigate("https://edge.k8s.g498.io/applications/8263/nodes/39891/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=data&applyPostprocessors=false");
            page.navigate("https://edge.k8s.g498.io/applications/8263/nodes/39891/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=data&split=dev&applyPostprocessors=false");
            page1.getByText("Expand 3 nodes").click();
            page1.locator("div").filter(new Locator.FilterOptions().setHasText("?Model")).first().click();
            page1.navigate("https://edge.k8s.g498.io/applications/8264/nodes/39894/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=data&split=dev&applyPostprocessors=false");
            page3.getByText("Expand 7 nodes").click();
            page3.locator("div").filter(new Locator.FilterOptions().setHasText("?Model")).first().click();
            page3.navigate("https://edge.k8s.g498.io/applications/8265/nodes/39898/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%7D%7D&mode=document&split=dev&applyPostprocessors=false");
            page4.getByText("Expand 8 nodes").click();
            page4.locator("div").filter(new Locator.FilterOptions().setHasText("?Model")).first().click();
            page4.navigate("https://edge.k8s.g498.io/applications/8266/nodes/39909/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%7D%7D&mode=document&split=dev&applyPostprocessors=false");
        }
    }
}

