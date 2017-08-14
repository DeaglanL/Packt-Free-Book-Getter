import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GetFreeBook {

    String userName = "**********";

    String passWord = "*********";


   private WebDriver webDriver;
   private ChromeOptions chromeOptions = new ChromeOptions();

    public void getBook()
    {
        chromeOptions.addArguments("--start-maximized");

        webDriver = new ChromeDriver(chromeOptions);

        webDriver.navigate().to("https://www.packtpub.com/");

        webDriver.findElement(By.cssSelector(".login-popup div:nth-child(1)")).click();

        webDriver.findElement(By.cssSelector("#packt-user-login-form > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys(userName);

        webDriver.findElement(By.cssSelector("#packt-user-login-form > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")).sendKeys(passWord);

        webDriver.findElement(By.cssSelector("#packt-user-login-form > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > input:nth-child(1)")).click();

        Actions a = new Actions(webDriver);

        a.moveToElement(webDriver.findElement(By.cssSelector("#main-carousel > div > div > div:nth-child(9) > div > div > div > a:nth-child(3) > div > div")));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.findElement(By.cssSelector("#main-carousel > div > div > div:nth-child(9) > div > div > div > a:nth-child(3) > div > div")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a.moveToElement(webDriver.findElement(By.cssSelector("#packt-freelearning-submit-claim > div")));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.findElement(By.cssSelector("#packt-freelearning-submit-claim > div")).click();



        webDriver.quit();

    }

    public GetFreeBook()
    {
        getBook();
    }
}
