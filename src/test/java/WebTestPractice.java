import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTestPractice {

    @Test                                //ААА
    public void testMenuStartTitle() {   //При переходе по ссылке открывается страница с меню старт

        String chromeDriver = "webdriver.chrome.driver";
        String drivePath = "C:/Testing programs/chromedriver_win32/chromedriver.exe";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, drivePath);
        WebDriver driver = new ChromeDriver();

        driver.get(url); //Открыть страницу сайта

        WebElement menuBrowseLanguages = driver.findElement( //Найти путь к элементу
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));

        menuBrowseLanguages.click(); //Нажать на пункт меню выше




    }
}
