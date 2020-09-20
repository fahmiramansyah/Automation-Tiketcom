package StepDef;

import StepDefImpl.User;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static StepDefImpl.WebUtility.*;

public class LoginLogoutPage {

    private ChromeDriver _driver = getChromeInstance();
    private StepDefImpl.Profile _profile = new StepDefImpl.Profile();
    String username;
    String password;

    public LoginLogoutPage(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public void enterEmail() {
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[1]/div[3]/div/div/input"), username);
    }

    public void enterPassword() {
        waitAndFill(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[2]/div/form/div[2]/div/input"), password);
    }

    public void clickLogin() {
        waitAndClick(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[1]/div[3]/div/div[2]/a[3]"));
    }

}
