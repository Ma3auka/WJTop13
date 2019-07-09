package co.WJ;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

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

}
