package co.WJ;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Top13Specific extends WebDriver {


    @Test
    public void Top13_XC2192K_MQ_12() throws Exception { //Открыть ссылку и проверка на title

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        if (driver.getPageSource().contains("2,699.77")) {
            System.out.println("Cost Done");
        }
        else {
            System.out.println("-Cost Fail");
        }

        Thread.sleep(2000);


        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t"); // открыть вкладку в новом окне
    }


    @Test
    public void Top13_XC2192K_OV_12() throws Exception {

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].styles.display = 'block';", driver.findElement(By.id("RD")));
        driver.findElement(By.id("RD")).click();

        Thread.sleep(5000);

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

