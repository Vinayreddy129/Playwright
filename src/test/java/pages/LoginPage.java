package pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class LoginPage {
    private final Page page;

    // Locators
    private final String usernameInput = "input[name='username']";
    private final String passwordInput = "input[name='password']";
    private final String loginButton = "button[type='submit']";

    // Constructor
    public LoginPage(Page page) {
        this.page = page;
    }

    // Actions
    public void login(String username, String password) {
        page.fill(usernameInput, username);
        page.fill(passwordInput, password);
        page.click(loginButton);
        page.waitForURL("**/dashboard");
        Assert.assertTrue(page.url().contains("dashboard"));

    }
}
