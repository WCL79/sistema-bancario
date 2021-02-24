package br.com.zup;

public interface Transacao {

    public void depositarNaConta(double valorADepositar);

    public boolean sacarDaConta(double valorASacar) throws Exception;

    public boolean transferirParaOutraConta(double valorATransferir, Conta conta) throws Exception;

    public void consultarSaldo();
}
