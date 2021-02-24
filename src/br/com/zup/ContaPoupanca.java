package br.com.zup;

public class ContaPoupanca extends Conta implements Transacao{
    public ContaPoupanca(String numero, String agencia, double saldo, String nome) {
        super(numero, agencia, saldo, nome);
    }

    @Override
    public void depositarNaConta(double valorADepositar) {

    }

    @Override
    public boolean sacarDaConta(double valorASacar) throws Exception {
        return false;
    }

    @Override
    public boolean transferirParaOutraConta(double valorATransferir, Conta conta) throws Exception {
        return false;
    }

    @Override
    public void consultarSaldo() {

    }
}
