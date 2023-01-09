package Selenium1;

//Импортируем WebDriverManager
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Проинициализируем WebDriverManager
        WebDriverManager.chromedriver().setup();
        //подключаем драйвер
        WebDriver driver = new ChromeDriver();
        //метод открывает указанную страницу
        driver.get("https://visit-tatarstan.com/");
        //создать переменную input со значением найденного элемента By.className
        WebElement inputCSS = driver.findElement(By.cssSelector("a[class='moreLink2']"));
        WebElement inputXP = driver.findElement(By.xpath(".//span[text()='День в Тетюшах']"));
        List<WebElement> inputList = driver.findElements(By.xpath(".//span[@class='artItemName']"));

        System.out.println(inputCSS);
        System.out.println(inputXP);
        //Вывести в консоль количество найденных элементов
        System.out.println(inputList.size());
        //метод закрывает браузер
        driver.quit();
    }
}
