package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //Неявное ожидание выполнения асинхронного запроса, до появления элемента
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        //метод открывает указанную страницу
        driver.get("https://www.google.com/");
        //Найти элемент xpath и ввести значения
        WebElement inputCSS = driver.findElement(By.cssSelector("input[class='gLFyf']"));
        inputCSS.sendKeys("Татарстан");
        //Очистить элемент
        inputCSS.clear();
        inputCSS.sendKeys("Тетюши");
        //Нажимаем Enter вместо нажатия по кнопке
        inputCSS.submit();
        driver.quit();
    }
}
