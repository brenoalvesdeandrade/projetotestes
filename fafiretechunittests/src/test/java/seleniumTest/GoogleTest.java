package seleniumTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest {

    private WebDriver driver;


    @BeforeEach
    public void browser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Breno Andrade\\Desktop\\Nova pasta (2)\\chrome113\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }

    @Test
    public void google() throws IOException, InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("fafire");
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(" //*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\temp\\screenshot.png"));
    }

}
