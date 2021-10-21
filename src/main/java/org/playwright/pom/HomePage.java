package org.playwright.pom;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;
    ContactPage contactPage;

    public static final String btnHomeMenu = "//a[.='Home (current)']";
    public static final String btnContactMenu = "//a[.='Contact']";

    public HomePage(Page page) {
        this.page = page;
        contactPage = new ContactPage(page);
    }

    public void navigate() {
        page.navigate("https://www.demoblaze.com/");
    }
    public void clickButtonHomeMenu() {
        page.click(btnHomeMenu);
    }

    public ContactPage clickButtonContactMenu() {
        page.click(btnContactMenu);
        return contactPage;
    }
}
