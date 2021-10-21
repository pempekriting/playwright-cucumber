package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.playwright.base.BasePage;
import org.playwright.pom.HomePage;

public class BaseSteps extends BasePage {
    HomePage homePage = new HomePage(getPage());

    @Given("User go to website")
    public void userGoToWebsite() {
        homePage.navigate();
    }

    @And("click contact menu")
    public void clickContactMenu() {
        homePage.clickButtonContactMenu();
    }
}