package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Top13Specific extends WebDriver {

    @Test
    public void Top13() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        System.out.println("- Click 1/3");
        Thread.sleep(10000);

/*
        //Thread.sleep(10000);

       // Assert.assertTrue(driver.findElement());

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

        Assert.assertTrue(driver.findElement(By.className(".builder-price-title.sticky-content.sticky-block")).getText().contains("$2,699.77"));
        System.out.println("- Cost Done");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(".builder-price-title.sticky-content.sticky-block")));

*/
    }
    @Test
    public void Gogle() throws Exception {

        driver.get("https://www.google.com.ua");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

        driver.findElement(By.name("q")).sendKeys("что такое баг");
        System.out.println("- Text");

        driver.findElement(By.name("q")).click();
        System.out.println("- Поиск");
        Thread.sleep(3000);

    }

}

