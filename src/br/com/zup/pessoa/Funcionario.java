package br.com.zup.pessoa;

import br.com.zup.Conta;
import br.com.zup.ContaCorrente;
import br.com.zup.ContaPoupanca;

public class Funcionario extends Pessoa{

    private int id;
    private String cargo;
    private boolean acessoTotal;

    public Funcionario(String nome, String sobrenome, String dataNascimento, String CPF, String cargo) {
        super(nome, sobrenome, dataNascimento, CPF);
        this.cargo = cargo;
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

    public void cadastrarContaCorrente(String numero, String agencia, double saldo, Pessoa pessoa) {
        Conta conta = new ContaCorrente(numero, agencia, saldo, pessoa);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "\nSobrenome: " + this.getSobrenome() +
                "\nData de nascimento: " + this.getDataNascimento() +
                "\nCPF: " + this.getCPF() +
                "\nCargo: " + this.getCargo();
    }
}
