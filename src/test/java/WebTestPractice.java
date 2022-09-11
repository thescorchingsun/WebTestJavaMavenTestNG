import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class WebTestPractice {

    /*
    Тест-кейс:
    1.Открыть страницу https://www.99-bottles-of-beer.net/
    2.Нажать пункт меню Browse Languages
    3.Нажать на пункт меню Start
    4.Подтвердить, что пользователь видит заголовок Welcome to 99 Bottles of Beer
    5.Закрыть браузер
     */

    @Test                                //ААА
    public void testMenuStartTitle() throws InterruptedException {   //При переходе по ссылке открывается страница с меню старт

        String chromeDriver = "webdriver.chrome.driver";
        String drivePath = "C:/Testing programs/ChromeDriver/chromedriver_win32/chromedriver.exe";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, drivePath);
        WebDriver driver = new ChromeDriver();

        driver.get(url); //Открыть страницу сайта

        WebElement menuBrowseLanguages = driver.findElement( //Найти путь к элементу
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowseLanguages.click(); //Нажать на вкладку Browse Languages
        //sleep(2000); //Задержка на 1 сек

        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click(); //Нажать на вкладку Start
        //sleep(2000);

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2")); //В элементе текст
        String ActualResult = h2.getText(); //В переменной текст
        //sleep(2000);

        Assert.assertEquals(ActualResult, expectedResult);

        driver.quit(); //Закрыть браузер после теста

    }
}
