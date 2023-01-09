package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test5 {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //раздел "1001 удовольствие"
        By element1001 = By.xpath("//a[contains(text(), '1001 удовольствие')]");
        //список "Все города"
        By elementList = By.xpath("//span[@class='icon-arr js-arrow arrow-red filter__arrow']");
        //список
        By elementList2 = By.xpath("//div[@class='filter__options options js-filter-select-options']");
        //список "Все города"
        By elementCityList = By.xpath(".//div[contains(@class, 'option filter__option js-option')]");
        //метод открывает указанную страницу
        driver.get("https://visit-tatarstan.com/");
        //Перейти в раздел "1001 удовольствие"
        driver.findElement(element1001).click();
        //Открыть список "Все города"
        driver.findElement(elementList).click();
        // Неявное ожидание в 3 секунды на открытие списка
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='filter js-filter-select filter_open']"));
        //Попытка прокрутить список-неудачная
        WebElement elementScroll = driver.findElement(elementList2);
        //((JavascriptExecutor)driver).executeScript(".//div[contains(text(), 'Чистополь')]", elementScroll);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", elementScroll);
        //Вывести в консоль количество элементов списка "Все города"
        List<WebElement> cityList = driver.findElements(elementCityList);

        System.out.println("Городов в списке " + cityList.size());
        //Создаем переменную с размером списка
        int countResult = cityList.size();
        //Создаем переменную эталонную
        int countExpected = 29;
        //Сравниваем полученную переменную и эталонную
        if (countResult == countExpected) {
            System.out.print("Количество городов = " + countExpected);
        } else if (countResult > countExpected) {
            System.out.print("Количество городов больше " + countExpected);
        }
        else {
            System.out.print("Количество городов меньше " + countExpected);
        }

        driver.quit();
    }
}
