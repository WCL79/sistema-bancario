package br.com.zup.pessoa;

public class Funcionario extends Pessoa{

    private int id;
    private String cargo;

    public Funcionario(String nome, String sobrenome, String dataNascimento) {
        super(nome, sobrenome, dataNascimento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
