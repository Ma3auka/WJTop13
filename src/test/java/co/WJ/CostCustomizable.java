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

public class CostCustomizable extends WebDriver {

    @Test
    public void CostStart() throws Exception {

        driver.get("");
        String url = driver.getCurrentUrl();
        System.out.println("- Open url: " + url);

        String title = driver.getTitle();
        System.out.println("- Title Done: " + title);
        Assert.assertTrue(title.contains(""));














    }

}
