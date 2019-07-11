package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Top13Specific extends WebDriver {

    @Test
    public void Top13() { //Открыть ссылку и проверка на title
        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        new Select(driver.findElement(By.id("diamond-size"))).selectByVisibleText("1/2 CT."); //drop-down list
        System.out.println("- Click 1/2");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

//      Assert.assertTrue(driver.findElement(By.className(".builder-price-title sticky-content sticky-block")).getText().contains("$3,699.99"));
//      System.out.println("- Cost Done");

    }

}

