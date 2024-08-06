package seleniumTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarrigaTest {
    private WebDriver driver;

    @BeforeEach
    public void browser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Breno Andrade\\Desktop\\Nova pasta (2)\\chrome113\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://seubarriga.wcaquino.me/login");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fafiretechautomacao@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"senha\"]")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();

    }


    @Test
    public void adicionarConta(){

        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"nome\"]")).sendKeys("fafire");
        driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button")).click();
        assertEquals("Conta adicionada com sucesso!",driver.findElement(By.xpath("/html/body/div[1]")).getText());
        driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr[1]/td[2]/a[2]/span")).click();


    }


}
