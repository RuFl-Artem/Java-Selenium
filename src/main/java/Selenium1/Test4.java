package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //иконка лупы
        By elementFind = By.cssSelector("div[class='hsMask js-search']");
        //форма поиска
        By formSearch = By.cssSelector("form[class='hSearch active']");
        //поле ввода
        By inputSearch = By.cssSelector("input[class='sText']");
        //поле ввода
        By inputSearchXP = By.xpath("//div[1]/form/input[2]");
        //Текст Результаты поиска
        By elementTextResult = By.xpath(".//h1[text()='Результаты поиска']");
        //метод открывает указанную страницу
        driver.get("https://visit-tatarstan.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Нажать на иконку лупы
        driver.findElement(elementFind).click();
        //Найти поле ввода и ввести значение и нажать ввод
        WebElement formCSS = driver.findElement(inputSearch);
        //Получить и вывести в консоль значение атрибута, свойства
        System.out.println("placeholder: " + formCSS.getAttribute("placeholder"));
        formCSS.sendKeys("Татарстан");
        formCSS.submit();
        //Получить в переменную text заголовок
        String text = driver.findElement(elementTextResult).getText();
        System.out.println("Заголовок: " + text);
        //Найти поле ввода, очистить, ввести значение и нажать ENTER
        WebElement elementInputSearchXP = driver.findElement(inputSearchXP);
        elementInputSearchXP.clear();
        elementInputSearchXP.sendKeys("Елабуга", Keys.ENTER);
        driver.quit();
    }
}
