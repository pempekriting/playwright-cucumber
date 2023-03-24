package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.playwright.base.BasePage;
import org.playwright.pom.ContactPage;

public class ContactSteps extends BasePage {
    ContactPage contactPage = new ContactPage(getPage());

    @When("User fill the form")
    public void userFillTheForm() {
        contactPage.inputContactEmail()
                .inputContactName()
                .inputMessage()
                .andSendMessage();
    }

    @Then("Message successfully send")
    public void messageSuccessfullySend() {
        contactPage.isDataSubmitted();
    }
}