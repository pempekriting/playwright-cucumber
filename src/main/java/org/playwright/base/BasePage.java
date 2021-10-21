package org.playwright.base;

import com.microsoft.playwright.*;

public class BasePage {
    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    public void createPageInstance() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    public void closePageInstance() {
        playwright.close();
        context.close();
    }

    public Page getPage() {
        return page;
    }
}