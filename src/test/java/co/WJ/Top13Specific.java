package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Top13Specific extends WebDriver {

    @Test
    public void Top13_XC2192K_MQ_12() throws Exception {

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " +title);
        Assert.assertTrue(title.contains("Build your own ring"));

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

            Thread.sleep(5000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("3,699.99")) {
            System.out.println("- Cost Done");
        }
        else {
            System.out.println("- Cost Fail");
        }

    }

    @Test
    public void Top13_XC2192K_OV_12() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

            Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("OV")));
        driver.findElement(By.id("OV")).click();

            Thread.sleep(5000);

        if (driver.getPageSource().contains("4,499.99")) {
            System.out.println("- Cost Done");
        }
        else {
            System.out.println("- Cost Fail");
        }

    }

    @Test
    public void Top13_XC1160K_PC_13() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC1160K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " +title);
        Assert.assertTrue(title.contains("Build your own ring"));

            Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("2,999.99")) {
            System.out.println("- Cost Done");
        }
        else {
            System.out.println("- Cost Fail");
        }

    }

    @Test
    public void Top13_XC1222K_PC_12() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC1160K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " +title);
        Assert.assertTrue(title.contains("Build your own ring"));

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("2,999.99")) {
            System.out.println("- Cost Done");
        }
        else {
            System.out.println("- Cost Fail");
        }

    }

    @Test
    public void Top13_XC2192K_MQ_12d() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("RD")));
        driver.findElement(By.id("RD")).click();

        WebDriverWait wait = new WebDriverWait(driver, 600);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("RD")));

            Thread.sleep(3000);

    }

}

