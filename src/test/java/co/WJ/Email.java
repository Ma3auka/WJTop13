package co.WJ;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.Random;

public class Email extends WebDriver{

    @Test
    public void Top13_Test() throws Exception {

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



/*      //Новая вкладка

        driver.executeScript("window.open('https://temp-mail.org/ru/', 'new_window')");
        Thread.sleep(3000);

 */
        //Попапчик

        driver.findElement(By.id("configuration-send")).click(); //Открыть попап

        Thread.sleep(2000);

        String emailSKU = "ma3au.pav@gmail.com";

        driver.findElement(By.id("user-email")).sendKeys(emailSKU); //Написать email

        Thread.sleep(2000);

        driver.findElement(By.linkText("Send")).click();

        Thread.sleep(2000);

    }

}
