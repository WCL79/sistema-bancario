package br.com.zup.pessoa;

public class Gerente extends Funcionario {

    public Gerente(String nome, String sobrenome, String dataNascimento, String CPF, String cargo) {
        super(nome, sobrenome, dataNascimento, CPF, cargo);
    }

    Funcionario analista1 = new Analista("Ricardo", "Alcantara", "22/02/1984", "333.333.333-33", "Analista");

    public boolean cadastrarFuncionario(String nome, String sobrenome, String dataNascimento, String CPF, String cargo){
        try {
            Funcionario funcionario = new Analista(nome, sobrenome, dataNascimento, CPF, cargo);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
