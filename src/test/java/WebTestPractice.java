import org.testng.annotations.Test;

public class WebTestPractice {

    @Test
    public void testMenuStartTitle() {   //При переходе по ссылке открывается страница с меню старт

        String chromeDriver = "webdriver.chrome.driver";
        String drivePath = "C:/Testing programs/chromedriver_win32/chromedriver.exe";
        String url = "https://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, drivePath);





    }
}
