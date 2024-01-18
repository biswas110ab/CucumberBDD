package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ProductCategory extends BrowserDriver {
    public static String productcategory_heading_xpath="//div[@id='SmokeTests']//h3[@id='ShoeType']";

    public static String visibility_productCategory()
    {
        String actualString=driver.findElement(By.xpath(productcategory_heading_xpath)).getText();
        return actualString;
    }
}
