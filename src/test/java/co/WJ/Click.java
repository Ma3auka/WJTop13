package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

/**
 * Click Sravni
 * @author Ma3auka
 * @version 1.0
 */

public class Click extends WebDriver {

    private String count;
    private Object args;

    @Test
    public void Sravni3_Web() throws Exception { //id 1,3
        driver.get("https://sravni.ua/firm2533.html");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle(); //Вывод тайтла
        System.out.println("- Title: " + title);
        Assert.assertTrue(title.contains("Интернет-магазин Acardion Украина: контакты, список товаров в Киеве, прайс листы, цены,")); //Проверка тайтла

        Thread.sleep(5000); // To Do

        driver.manage().deleteAllCookies();
        System.out.println("- Cookies kill");

        driver.navigate().refresh();
        System.out.println("- F5");
        Thread.sleep(5000);



        driver.findElement(By.cssSelector("table > tr:nth-child(10)"));



// table > tr:nth-child(10)
    }
    @Test
    public void Sravni3_Click_Web() throws Exception { //id 1,3
        driver.get("http://web5.release.price.ua/clicks.php?firm_id=2533");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        Thread.sleep(5000); // To Do


        driver.findElement(By.cssSelector("table > tbody > tr:nth-child(2) > td:nth-child(10)"));
//        table > tbody > tr:nth-child(2) > td:nth-child(10)

 //       Assert.assertTrue();






    }

}



