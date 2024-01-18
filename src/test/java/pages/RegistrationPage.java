package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {
    public static String registration_heading_xpath="//h1[normalize-space()='User Registration Page']";
    public static String visibility_registrationheading()
    {
        String getRegistration=driver.findElement(By.xpath(registration_heading_xpath)).getText();
        return  getRegistration;


    }
}
