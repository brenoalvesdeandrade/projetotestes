package exercicio;

import org.example.Exercicio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExercicioTest {

    Exercicio exercicio = new Exercicio();


    @Test
    public void validarNumero1MaiorQueNumero3() {
        assertEquals(exercicio.calcularNumeros(Integer.valueOf("10"), Integer.valueOf("10")), 40);
    }


    @Test
    public void validarPlaca(){
       assertTrue(exercicio.validarPlaca("ABC2134"));

}


}
