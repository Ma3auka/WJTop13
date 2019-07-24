package co.WJ;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.util.Random;


public class Sdc extends WebDriver {


    @Test
    public void CostStart() throws Exception {

        long start = System.currentTimeMillis();

        driver.get("https://www.zales.com/dsvw-marq-u1/p/V-20301678");
        long finish = System.currentTimeMillis();
        long totalTime = start - finish;
        System.out.println(totalTime);

        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);


 /*       String title = driver.getTitle();
        System.out.println("- Title Done: " + title);
        Assert.assertTrue(title.contains("Sign in"));

        driver.findElement(By.id("loginform-email")).sendKeys("sdc-designs@wonderjewel.co");
        driver.findElement(By.id("loginform-password")).sendKeys("aj70QCLfAS!Gh%Ef");
        System.out.println("- email/pass Done");

        driver.findElement(By.className("btn-default,btn-submit")).click();


  */












    }

}
