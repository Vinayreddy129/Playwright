package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.navigate();
        loginPage.login("Admin", "admin123");

        assertTrue(page.url().contains("dashboard"));
    }
}
