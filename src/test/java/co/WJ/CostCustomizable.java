package co.WJ;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Random;

public class CostCustomizable extends WebDriver {

    @Test
    public void CostStart() throws Exception {

        StopWatch watch = new StopWatch();
        watch.start();

        driver.get("https://www.zales.com/dsvw-marq-u1/p/V-20301678");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title: " + title);

        watch.stop();
        System.out.println("Time Elapsed: " + watch.getTime());



    }

}
