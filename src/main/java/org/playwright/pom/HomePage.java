package org.playwright.pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private final Page page;
    private final Locator btnHomeMenu;
    private final Locator btnContactMenu;

    public HomePage(Page page) {
        this.page = page;
        this.btnHomeMenu = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home (current)"));
        this.btnContactMenu = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contact"));
    }

    public void navigate() {
        page.navigate("https://www.demoblaze.com/");
    }

    public void clickButtonHomeMenu() {
        btnHomeMenu.click();
    }

    public void clickButtonContactMenu() {
        btnContactMenu.click();
    }
}
