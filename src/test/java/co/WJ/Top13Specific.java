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
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Top13Specific extends WebDriver {

    private String count;
    private Object args;

    @Test
    public void Top13_XC2192K_MQ_12() throws Exception { //id 1,3

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " +title);
        Assert.assertTrue(title.contains("Build your own ring"));

            Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

            Thread.sleep(5000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("3,699.99")) {
            System.out.println("- Cost Done (XC2192K 3,699.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC2192K 3,699.99)");
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("OV")));
        driver.findElement(By.id("OV")).click();

        Thread.sleep(5000);

        if (driver.getPageSource().contains("4,499.99")) {
            System.out.println("- Cost Done (XC2192K 4,499.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC2192K 4,499.99)");
        }

    }


    @Test
    public void Top13_XC1035P_RD_12_1() throws Exception { //id 4,5,6,7

        driver.get("https://zales.wonderjewel.co/configurator/XC1035P");
        System.out.println("- Open url");

        String title = driver.getTitle();
        System.out.println("- Title Done: " +title);
        Assert.assertTrue(title.contains("Build your own ring"));

            Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1035P 9,999.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC1035P 9,999.99)");
        }

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1035P 4,699.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC1035P 4,699.99)");
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("PR")));
        driver.findElement(By.id("PR")).click();

            Thread.sleep(5000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1035P 4,699.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot(XC1035P 4,699.99)");
        }

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

            Thread.sleep(5000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1035P 9,999.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC1035P 9,999.99)");
        }

    }

    @Test
    public void Top13_XC1160K_PC_13() throws Exception { //id 8

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
            System.out.println("- Cost Done (XC1160K 2,999.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC1160K 2,999.99)");
        }

    }


    @Test
    public void Top13_XC1222K_PC_12() throws Exception { //id 10

        driver.get("https://zales.wonderjewel.co/configurator/XC1222K");
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

        if (driver.getPageSource().contains("3,999.99")) {
            System.out.println("- Cost Done (XC1222K 3,999.99)");
        }
        else {
            int number = new Random().nextInt(1000)+5;

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot"+number+".png"));

            System.out.println("- Screenshot (XC1222K 3,999.99)");
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

