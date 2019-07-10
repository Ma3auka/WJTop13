package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.junit.rules.Timeout;
import org.w3c.dom.Text;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.exec.environment.DefaultProcessingEnvironment;
import org.checkerframework.checker.formatter.FormatUtil;
import java.util.concurrent.TimeUnit;

public class Top13Specific extends WebDriver {

    @Test
    public void Top13() { //Открыть ссылку и проверка на title
        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

        new Select(driver.findElement(By.id("diamond-size"))).selectByVisibleText("1/2 CT."); //drop-down list
        System.out.println("- Click 1/2");






        Assert.assertTrue(driver.findElement(By.cssSelector(".builder-price-block")).getText().contains("3,699.99"));
        System.out.println("- Cost Done");
    }
}

