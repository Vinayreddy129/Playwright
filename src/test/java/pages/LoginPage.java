package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    private String username = "input[name='username']";
    private String password = "input[name='password']";
    private String loginBtn = "button[type='submit']";

    public void navigate() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void login(String user, String pass) {
        page.fill(username, user);
        page.fill(password, pass);
        page.click(loginBtn);
    }
}
