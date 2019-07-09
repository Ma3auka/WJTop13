package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JewelTest extends WebDriver {

    @Test
    public void Top13() { //Открыть ссылку и проверка на title
        driver.get("https://testwonderjeweldev1.zales.com/configurator/XC1090");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");
    }

    @Test
    public void WJ() { //Открыть ссылку и проверка на title
        driver.get("https://testwonderjeweldev1.zales.com/configurator/XC1090");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");
    }

}
