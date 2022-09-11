import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTestPractice2 extends BaseUtils {

    // @BeforeTest
    //driver.get("https://www.google.com/");
    //   driver.manage().window().fullscreen();
    //   driver.manage().deleteAllCoolies();


    @Test (priority = 1)
    public void testSearchGooglNational() {

        System.setProperty(chromeDriver, drivePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("national geographic");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();

        driver.quit();
    }

   // @AfterMethod
   // void Close() { //Закрытие браузера после всех тестов
   //     driver.close();
   // }

}
