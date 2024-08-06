package seleniumTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumPO.DSL;
import seleniumPO.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    private WebDriver driver;
    private DSL dsl;
    private LoginPage loginPage;

    @BeforeEach
    public void browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Breno Andrade\\Desktop\\Nova pasta (2)\\chrome113\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
        dsl = new DSL(driver);

    }

    @Test
    @Order(2)
    public void realizarLoginComSucesso(){

            loginPage.preencherCampoNomeUsuario("tomsmith");
            loginPage.preencherCampoSenha("SuperSecretPassword!");
            loginPage.clicarBotaoLogin();
           // driver.quit();
           assertEquals("Welcome to the Secure Area. When you are done click logout below.", dsl.messagemSucesso());

        }

    @Test
    @Order(1)
    public void realizarLoginComErro(){

        loginPage.preencherCampoNomeUsuario("123");
        loginPage.preencherCampoSenha("1234");
        loginPage.clicarBotaoLogin();
        driver.quit();
        //assertEquals("Welcome to the Secure Area. When you are done click logout below.", dsl.messagemSucesso());

    }


}

