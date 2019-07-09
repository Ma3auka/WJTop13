package co.WJ;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;
import org.w3c.dom.Text;

public class Top13Specific extends WebDriver {
    @Test
    public void Top13() { //Открыть ссылку и проверка на title
        driver.get("https://testwonderjeweldev1.zales.com/configurator/XC1090");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

        Assert.assertTrue(driver.findElement(By.cssSelector(".builder-product-title")).getText().contains("Vera Wang Love Round Diamond Engagement Ring"));
        System.out.println("- Title");
        Assert.assertTrue(driver.findElement(By.cssSelector(".builder-price-block")).getText().contains("2,499.99"));
        System.out.println("- Title2");

    }



}
