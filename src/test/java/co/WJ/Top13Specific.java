package co.WJ;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;


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

        System.out.println("- Click 1/3");
        Thread.sleep(3000);

    }

}

