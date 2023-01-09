package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //Неявное ожидание 3 секунды до появления элемента
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //метод открывает указанную страницу
        driver.get("https://visit-tatarstan.com/");
        //создать переменную input со значением найденного элемента By.className
        WebElement elementXPATH = driver.findElement(By.xpath(".//span[text()='День в Тетюшах']"));
        //Нажать на созданную переменную
        elementXPATH.click();
        //Найти элемент xpath и нажать на него
        driver.findElement(By.xpath("//li[1]/div[1]/h3/a")).click();
        driver.quit();
    }
}
