package org.example;

public class Exercicio {


     //Exercicio 1
    public Integer calcularNumeros(Integer numero1, Integer numero2){

        int soma = numero1 + numero2;

        return soma;

    }

    //Exercicio 2
    public Integer subtrairNumeros(){


        return null;
    }

    //Exercicio 3
    public Integer multiplicarNumeros(){


        return null;
    }

    //Exercicio 4
    public  boolean validarPlaca(String placa){
        boolean valido = true;
        if(placa.length() != 7){
            valido = false;
        }
        if(!placa.substring(0, 3).matches("[A-Z]*")){
            valido = false;
        }
        if(!placa.substring(3).matches("[0-9]*")){
            valido = false;
        }
        return valido;

    }






}
