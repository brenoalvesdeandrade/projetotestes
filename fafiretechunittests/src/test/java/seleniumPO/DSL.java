package seleniumPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

private WebDriver driver ;


    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoUsuario(String username){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);

    }


    public void preencherCampoSenha(String senha){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(senha);

    }

    public void clicarBotaoLogin(){
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

    }

    public String messagemSucesso(){
        String messagem;
        messagem = driver.findElement(By.xpath("/html/body/div[2]/div/div/h4")).getText();
        return messagem;
    }

}
