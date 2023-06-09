package ProjectPlaywright;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class snorkelauto {
        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();
                page.navigate("https://edge.k8s.g498.io/admin/login");
                page.getByLabel("Username").click();
                page.getByLabel("Username").fill("username");
                page.getByLabel("Password").click();
                page.getByLabel("Password").click();
                page.getByLabel("Password").fill("sn0rkeLFLOW!");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
                page.locator("header").filter(new Locator.FilterOptions().setHasText("ApplicationsCreated by meCreate application")).getByRole(AriaRole.BUTTON).nth(1).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create from preset")).click();
                page.getByPlaceholder("Search for preset applications").click();
                page.getByPlaceholder("Search for preset applications").fill("[DEMO] seq-tag-company-financial-news_Q2-2022");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("IE Information Extraction [DEMO] seq-tag-company-financial-news_Q2-2022 All industry icon Official Demo Path for the Summer 2022 release")).click();
                page.getByPlaceholder("email-clf-application-graph").click();
                page.getByPlaceholder("email-clf-application-graph").click();
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").press("ArrowRight");
                page.getByPlaceholder("email-clf-application-graph").fill("[DEMO] seq-tag-company-financial-news_Q2-pankaj-2023-6-002");
                page.getByPlaceholder("dataset-name").click();
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").press("ArrowRight");
                page.getByPlaceholder("dataset-name").fill("[DEMO] seq-tag-company-financial-news_Q2-pankaj-2023-6-002");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
                Page page1 = context.newPage();
                page1.close();
                page.navigate("https://edge.k8s.g498.io/applications/8887");
                page.getByText("Expand 3 nodes").click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText("?Model")).first().click();
                page.navigate("https://edge.k8s.g498.io/applications/8887/nodes/41988/studio");
                page.navigate("https://edge.k8s.g498.io/applications/8887/nodes/41988/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&applyPostprocessors=false");
                page.navigate("https://edge.k8s.g498.io/applications/8887/nodes/41988/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=data&applyPostprocessors=false");
                page.navigate("https://edge.k8s.g498.io/applications/8887/nodes/41988/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=data&split=dev&applyPostprocessors=false");
                page.getByPlaceholder("Type anything to start creating an LF").click();
                page.getByPlaceholder("Type anything to start creating an LF").fill("/Sequence Contex");
                page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Sequence Context")).getByText("Sequence Context").click();
                page.getByPlaceholder("Value").click();
                page.getByPlaceholder("Value").fill("Inc");
                page.getByRole(AriaRole.SPINBUTTON).click();
                page.getByRole(AriaRole.SPINBUTTON).fill("1");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a label")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a label")).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a label")).click();
                page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("COMPANY")).getByText("COMPANY").click();
                page.locator(".mb-auto > .h-8").click();
                page.locator(".mb-auto > .h-8").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Advanced settings")).click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText("Case sensitive")).click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText("Include context")).locator("div").nth(2).click();
                page.locator("div").filter(new Locator.FilterOptions().setHasText("Word Boundary Tokenizer")).locator("div").nth(3).click();
                page.getByLabel("Tokens").check();
                page.locator("div:nth-child(291) > div").first().click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create LF")).click();
                page.getByPlaceholder("Type anything to start creating an LF").click();
                page.getByPlaceholder("Type anything to start creating an LF").fill("/Sequence Entity Dict");
                page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Sequence Entity Dict")).getByText("Sequence Entity Dict").click();
                page.getByPlaceholder("Entity dict path").click();
                page.getByPlaceholder("Entity dict path").fill("s3://snorkel-workshop-data/financial-news/f500_ticker_key_fixed.json");
                page.locator(".mb-auto > .h-8").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Advanced settings")).click();
                page.locator(".px-3 > div > .inline-flex > .relative > .track").click();
                page.locator("div:nth-child(266) > div").first().click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Advanced settings")).click();
                page.locator("div:nth-child(266) > div").first().click();
                page.locator("div:nth-child(265) > div").first().click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select a label")).click();
                page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("COMPANY")).getByText("COMPANY").click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create LF")).click();
                page.navigate("https://edge.k8s.g498.io/applications/8887/nodes/41988/studio?commonFilters=%7B%22config%22%3A%7B%22filters%22%3A%5B%5D%2C%22graph%22%3A%5B%22%24AND%22%5D%7D%7D&spanFilters=%7B%22sortOptions%22%3A%7B%22column%22%3A%22%22%2C%22order%22%3A%22asc%22%2C%22random%22%3Afalse%7D%7D&mode=search&split=dev&applyPostprocessors=false");
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Notebook")).click();
                page.frameLocator("iframe[title=\"notebook\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Sort by last modified")).click();
                page.frameLocator("iframe[title=\"notebook\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Click to browse for a file to upload.")).click();
                page.frameLocator("iframe[title=\"notebook\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Click to browse for a file to upload.")).setInputFiles(Paths.get("demo_analysis_nb_v3 (6).ipynb"));
                page.frameLocator("iframe[title=\"notebook\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Upload").setExact(true)).click();
                Page page2 = page.waitForPopup(() -> {
                    page.frameLocator("iframe[title=\"notebook\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("demo_analysis_nb_v3 (6).ipynb")).click();
                });
                page2.getByText("\"APP_NAME\"").click();
            }
        }
    }
