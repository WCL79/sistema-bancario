package br.com.zup;

public class ContaCorrente extends Conta implements Transacao{

    public ContaCorrente(String numero, String agencia, double saldo, String nome) {
        super(numero, agencia, saldo, nome);
    }

    @Override
    public String toString() {
        return "-- Conta Corrente --"
                +super.toString();
    }
}
