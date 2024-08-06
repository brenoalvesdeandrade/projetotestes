package seleniumPO;

import org.openqa.selenium.WebDriver;

public class LoginPage {

    private DSL dsl;

    public LoginPage(WebDriver driver) {
       dsl = new DSL(driver);
    }

    public void preencherCampoNomeUsuario(String username){

        dsl.preencherCampoUsuario(username);

    }

    public void preencherCampoSenha(String senha){

        dsl.preencherCampoSenha(senha);

    }

    public void clicarBotaoLogin(){

        dsl.clicarBotaoLogin();

    }



}
