package org.example;

public class Pessoa {

    String nome;
    String idade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public boolean validarNomePessoa() {

        boolean valido = true;
        if (getNome().equals(null) || getNome().length() > 5) {

            valido = false;

        }
        return valido;
    }
}
