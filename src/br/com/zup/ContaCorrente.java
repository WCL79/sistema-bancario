package br.com.zup;

import br.com.zup.pessoa.Pessoa;

public class ContaCorrente extends Conta implements Transacao{

    public ContaCorrente(String numero, String agencia, double saldo, Pessoa pessoa) {
        super(numero, agencia, saldo, pessoa);
    }

    /*@Override
    public void cadastrarContaCorrente(String numero, String agencia, double saldo, Pessoa pessoa) {
        super.cadastrarContaCorrente(numero, agencia, saldo, pessoa);
    }*/

    @Override
    public String toString() {
        return "-- Conta Corrente --"
                +super.toString();
    }
}
