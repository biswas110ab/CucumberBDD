package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu_xpath="//input[@type='checkbox']";
    public static String sign_link_xpath="//li[normalize-space()='Sign In Portal']";
    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }
    public static void click_signin_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_link_xpath)).click();
    }
}
