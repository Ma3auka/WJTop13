package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Top13Specific extends WebDriver {

    @Test
    public void Top13() throws Exception { //Открыть ссылку и проверка на title

        WebDriverWait wait = new WebDriverWait(driver, 30, 500); //Ожидание элемента

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        new Select(driver.findElement(By.id("diamond-size"))).selectByVisibleText("1 CT."); //drop-down list
        System.out.println("- Click 1/2");

        //Thread.sleep(10000);

       // Assert.assertTrue(driver.findElement());

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

        Assert.assertTrue(driver.findElement(By.className(".builder-price-title.sticky-content.sticky-block")).getText().contains("$2,699.77"));
        System.out.println("- Cost Done");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(".builder-price-title.sticky-content.sticky-block")));


    }

}

