package co.WJ;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver {

    public ChromeDriver driver;

    @Before
    public void UpDriver () { //Запустить и открыть браузер
        System.setProperty("webdriver.chrome.driver", "/Program Files (x86)/WebDr/chromedriver.exe"); //Путь к драйверу
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30, 500); //Ожидание элемента

        driver.manage().window().maximize();
        System.out.println("- Test Start"); //Выводим в консоль строку что двайвер поднялся
        System.out.println("- Screen resolution:");
        System.out.println(driver.manage().window().getSize()); //Размеры экрана
    }

    @After
    public void KillDriver () { //Закрыть браузер, драйвер
        if (driver != null)
        driver.close();
        driver.quit();
        System.out.println("- Kill Draiver"); //Выводим в консоль строку что двайвер убит
    }

}
