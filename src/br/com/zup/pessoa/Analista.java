package br.com.zup.pessoa;

public class Analista extends Funcionario{

    private final boolean acessoTotal = false;

    public Analista(String nome, String sobrenome, String dataNascimento, String CPF, String cargo) {
        super(nome, sobrenome, dataNascimento, CPF, cargo);
    }


}
