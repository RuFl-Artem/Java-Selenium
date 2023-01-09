package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //element File
        By FileSearch = By.xpath("//img[@class='Gdd5U']");
        //inputFile
        By inputFile = By.xpath("//input[@class='gLFyf']");
        //Неявное ожидание 3 секунды до появления элемента
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //метод открывает указанную страницу
        driver.get("https://www.google.com/");
        driver.findElement(FileSearch).click();
        driver.findElement(inputFile).sendKeys("D:\\Documents\11.jpg", Keys.ENTER);
        driver.quit();
    }
}
