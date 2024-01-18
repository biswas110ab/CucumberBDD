package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInPage extends BrowserDriver {
    public static String username_xpath_text_xpath="//input[@id='usr']";
    public static String password_text_xpath="//input[@id='pwd']";
    public static String login_btn_xpath="//input[@value='Login']";
    public static String registration_btn_xpath="//button[@id='NewRegistration']";
    public static void sendkeys_username()
    {
        driver.findElement(By.xpath(username_xpath_text_xpath)).sendKeys("sa");
    }
    public static void sendkeys_password()
    {
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("sa");
    }
    public static void click_login_btn()
    {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
    public static void click_newregistration_btn()
    {
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }


}
