package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.playwright.base.BasePage;

public class PlayWrightHooks {
    BasePage basePage;

    @Before
    public void launchBrowser() {
        basePage = new BasePage();
        basePage.createPageInstance();
    }

    @After
    public void closeBrowser() {
        //basePage.closePageInstance();
    }
}