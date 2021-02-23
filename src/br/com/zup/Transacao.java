package br.com.zup;

public interface Transacao {

    public void depositarNaConta(double valorADepositar);

    public boolean sacarDaConta(double valorASacar);

    public boolean transferirParaOutraConta(double valorATransferir, Conta conta);

    public void consultarSaldo();
}
