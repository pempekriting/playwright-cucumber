package org.playwright.pom;

import com.microsoft.playwright.Page;
import org.playwright.utils.Helper;

import static org.testng.Assert.assertEquals;

public class ContactPage {
    private final Page page;

    private static final String inpContactEmail = "id=recipient-email";
    private static final String inpContactName = "id=recipient-name";
    private static final String inpMessage = "id=message-text";
    private static final String btnSendMessage = "//button[.='Send message']";

    public ContactPage(Page page) {
        this.page = page;
    }

    public ContactPage inputContactEmail() {
        page.fill(inpContactEmail, Helper.getFaker().internet().emailAddress());
        return this;
    }

    public ContactPage inputContactName() {
        page.fill(inpContactName, Helper.getFaker().name().fullName());
        return this;
    }

    public ContactPage inputMessage() {
        page.fill(inpMessage, Helper.getFaker().chuckNorris().fact());
        return this;
    }

    public ContactPage andSendMessage() {
        page.click(btnSendMessage);
        return this;
    }

    public void isDataSubmitted() {
        page.onDialog(dialog -> {
            String test = dialog.message();
            System.out.println(test);
            assertEquals("Thanks for the message!!", dialog.message());
            dialog.accept();
        });
    }
}