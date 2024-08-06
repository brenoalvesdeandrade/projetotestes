package exercicio;

import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PessoaTest {



    @Test
    public void validarNomePessoaNull(){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(null);
        assertEquals(pessoa.getNome(),null);

    }

}
