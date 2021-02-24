package br.com.zup;

public class ContaPoupanca extends Conta implements Transacao{
    public ContaPoupanca(String numero, String agencia, double saldo, String nome) {
        super(numero, agencia, saldo, nome);
    }

    @Override
    public String toString() {
        return "-- Conta Poupança --"
                +super.toString();
    }
}
