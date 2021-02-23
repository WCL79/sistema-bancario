package br.com.zup;

public class ContaCorrente extends Conta implements Transacao{

    double limite;
    public ContaCorrente(String numero, String agencia, double saldo, String nome) {
        super(numero, agencia, saldo, nome);
    }

    @Override
    public void depositarNaConta(double valorADepositar) {
        this.saldo += valorADepositar;
    }

    @Override
    public boolean sacarDaConta(double valorASacar) throws Exception {
        if(this.saldo >= valorASacar) {
            this.saldo -= valorASacar;
            return true;
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

    @Override
    public boolean transferirParaOutraConta(double valorATransferir, Conta conta) throws Exception {
        this.existeConta(conta);
        if(this.getSaldo() >= valorATransferir && this.getNumero() != conta.getNumero()) {
            conta.setSaldo(valorATransferir);
            this.diminuirSaldo(valorATransferir);
            return true;
        } else if(this.getSaldo() <= valorATransferir) {
            throw new Exception("Saldo insuficiente");
        } else if(this.getNumero() == conta.getNumero()){
            throw new Exception("A conta de destino é a mesma da conta informada");
        }
        return false;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta: " + this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta Corrente "
                + "\nnome: " + nome
                + "\nsaldo: " + saldo
                + "\nnumero: " + numero
                + "\nagencia: " + agencia;
    }
}
