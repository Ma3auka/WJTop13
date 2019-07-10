package co.WJ;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class JewelTest {

    public ChromeDriver driver;

    @Before
    public void UpDriver () { //Запустить и открыть браузер
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/WebDr/chromedriver.exe"); //Путь к драйверу
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("- Test Start"); //Выводим в консоль строку что двайвер поднялся
    }

    @After
    public void KillDriver () { //Закрыть браузер, драйвер
        driver.close();
        driver.quit();
        System.out.println("- Kill Draiver"); //Выводим в консоль строку что двайвер убит
    }

    @Test
    public void Top13() { //Открыть ссылку и проверка на title
        driver.get("https://zales.wonderjewel.co/configurator/XC2192K");
        System.out.println("- Open url");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Build your own ring"));
        System.out.println("- Check title");

        new Select(driver.findElement(By.id("diamond-size"))).selectByVisibleText("1/2 CT."); //drop-down list
        System.out.println("- Click 1/2");

//      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//      driver.manage().timeouts().setScriptTimeout(10000, TimeUnit.SECONDS);
//      driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
//      WebElement dynamicElement = (WebElement) new WebDriverWait(driver, 10000);

//      Assert.assertTrue(driver.findElement(By.cssSelector(".builder-price-block")).getText().contains("3,699.99"));
//      System.out.println("- Cost Done");
    }


}
