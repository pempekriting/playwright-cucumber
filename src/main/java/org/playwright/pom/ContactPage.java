package org.playwright.pom;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.playwright.utils.Helper;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactPage {

    private final Page page;
    private final Locator inpContactEmail;
    private final Locator inpContactName;
    private final Locator inpMessage;
    private final Locator btnSendMessage;

    public ContactPage(Page page) {
        this.page = page;
        this.inpContactEmail = page.locator("#recipient-email");
        this.inpContactName = page.locator("#recipient-name");
        this.inpMessage = page.locator("#message-text");
        this.btnSendMessage = page.getByText("Send message");
    }

    public ContactPage inputContactEmail() {
        inpContactEmail.fill(Helper.getFaker().internet().emailAddress());
        return this;
    }

    public ContactPage inputContactName() {
        inpContactName.fill(Helper.getFaker().name().fullName());
        return this;
    }

    public ContactPage inputMessage() {
        inpMessage.fill(Helper.getFaker().chuckNorris().fact());
        return this;
    }

    public void andSendMessage() {
        btnSendMessage.click();
    }

    public void isDataSubmitted() {
        page.onDialog(dialog -> {
            String test = dialog.message();
            System.out.println(test);
            assertThat(dialog.message()).isEqualTo("Thanks for the message!!");
            dialog.accept();
        });
    }
}