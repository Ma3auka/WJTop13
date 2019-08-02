package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.security.Key;
import java.util.Random;

public class Top13Specific extends WebDriver {

    private String count;
    private Object args;

    @Test
    public void Top13_XC2192K() throws Exception { //id 1,3

        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("3,699.99")) {
            System.out.println("- Cost Done (XC2192K 3,699.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC2192K 3,699.99)");
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("OV")));
        driver.findElement(By.id("OV")).click();

        Thread.sleep(8000);

        if (driver.getPageSource().contains("4,499.99")) {
            System.out.println("- Cost Done (XC2192K 4,499.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC2192K 4,499.99)");
        }

    }

    @Test
    public void Top13_XC1035P() throws Exception { //id 4,5,6,7

        driver.get("https://zales.wonderjewel.co/configurator/XC1035P");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1035P 9,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1035P 9,999.99)");
        }

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1035P 4,699.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1035P 4,699.99)");
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("PR")));
        driver.findElement(By.id("PR")).click();

        Thread.sleep(8000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1035P 4,699.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot(XC1035P 4,699.99)");
        }

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1035P 9,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1035P 9,999.99)");
        }

    }

    @Test
    public void Top13_XC1160K() throws Exception { //id 8

        driver.get("https://zales.wonderjewel.co/configurator/XC1160K");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("2,999.99")) {
            System.out.println("- Cost Done (XC1160K 2,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1160K 2,999.99)");
        }

    }

    @Test
    public void Top13_XC1222K() throws Exception { //id 10

        driver.get("https://zales.wonderjewel.co/configurator/XC1222K");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

        Thread.sleep(6000);

        if (driver.getPageSource().contains("3,999.99")) {
            System.out.println("- Cost Done (XC1222K 3,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1222K 3,999.99)");
        }

    }

    @Test
    public void Top13_XC1427() throws Exception { //id 12

        driver.get("https://zales.wonderjewel.co/configurator/XC1427");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("2,999.99")) {
            System.out.println("- Cost Done (XC1427 2,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1427 2,999.99)");
        }

    }

    @Test
    public void Top13_XC1861K() throws Exception { //id 14

        driver.get("https://zales.wonderjewel.co/configurator/XC1861K");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/2 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("3,999.99")) {
            System.out.println("- Cost Done (XC1861K 3,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1861K 3,999.99)");
        }

    }

    @Test
    public void Top13_XC1090() throws Exception { //id 18

        driver.get("https://zales.wonderjewel.co/configurator/XC1090");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("PE")));
        driver.findElement(By.id("PE")).click();

        Thread.sleep(8000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1/3 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1/3 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("2,499.99")) {
            System.out.println("- Cost Done (XC1090 2,499.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1090 2,499.99)");
        }

    }

    @Test
    public void Top13_XC1061() throws Exception { //id 19,20,21,22

        driver.get("https://zales.wonderjewel.co/configurator/XC1061");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Build your own ring"));

        Thread.sleep(5000);

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1061 9,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1061 9,999.99)");
        }

         dropdown = new Select(driver.findElement(new By.ByName("size")));
         dropdown.selectByVisibleText("1/2 CT.");

         Thread.sleep(8000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1061 4,699.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1061 4,699.99)");
        }

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", driver.findElement(By.id("RD")));
        driver.findElement(By.id("RD")).click();

        Thread.sleep(8000);

        if (driver.getPageSource().contains("4,699.99")) {
            System.out.println("- Cost Done (XC1061 4,699.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1061 4,699.99)");
        }

        dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("9,999.99")) {
            System.out.println("- Cost Done (XC1061 9,999.99)");
        } else {
            int number = new Random().nextInt(1000) + 5;

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png"));

            System.out.println("- Screenshot (XC1061 9,999.99)");
        }

    }

    @Test
    public void Top13_Test() throws Exception { //id 19,20,21,22

        driver.get("https://www.zales.com/customize-your-vera-wang-love-collection-34-ct-tw-to-212-ct-tw-diamond-cushion-frame-engagement-ring/p/V-20301716?rrec=true");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);

        Assert.assertTrue(title.contains("Customize Your Vera Wang Love Collection 3/4 CT. T.W. to 2-1/2 CT. T.W. Diamond Cushion Frame Engagement Ring | Vera Wang LOVE | Zales")); //Проверка title

        new Select(driver.findElement(new By.ByName("size"))).selectByVisibleText("1 CT."); //drop-down list
        Select dropdown = new Select(driver.findElement(new By.ByName("size")));
        dropdown.selectByVisibleText("1 CT.");

        Thread.sleep(8000);

        if (driver.getPageSource().contains("12,374.71")) { //Проверка цены
            System.out.println("- Cost Done (V-20301716 12,374.71)");
        } else {
            int number = new Random().nextInt(1000); //Рандомайзер числа

            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\screenshot\\screenshot" + number + ".png")); //Сдлеать скриншот

            System.out.println("- Screenshot (V-20301716 12,374.71)");
        }

        JavascriptExecutor jsx = (JavascriptExecutor)driver; //Прокрутка страницы
        jsx.executeScript("window.scrollBy(0,450)", "");

        new Select(driver.findElement(new By.ByName("ring_size"))).selectByVisibleText("Select Ring Size"); //drop-down list
        dropdown = new Select(driver.findElement(new By.ByName("ring_size")));
        dropdown.selectByVisibleText("7.25");

        System.out.println("- DropDown 7.25");

        Thread.sleep(2000);

        //Новая вкладка

        driver.executeScript("window.open('https://temp-mail.org/ru/', 'new_window')");
        Thread.sleep(3000);

        //Попапчик

        driver.findElement(By.id("configuration-send")).click(); //Открыть попап

        Thread.sleep(2000);

        driver.findElement(By.id("user-email")).sendKeys(); //Написать email


    }


}





