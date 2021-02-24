package br.com.zup;

import br.com.zup.pessoa.Pessoa;

public class Conta implements Transacao {
    private double saldo;
    private String numero, agencia;
    private Pessoa pessoa;

    public Conta(String numero, String agencia, double saldo, Pessoa pessoa) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public Pessoa getNome() {
        return pessoa;
    }

    public void setNome(Pessoa nome) {
        this.pessoa = pessoa;
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

    public void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }

    public boolean existeConta(Conta conta) throws Exception {
        if(conta.getNumero() != null) {
            return true;
        } else {
            throw new Exception("Conta inexistente");
        }
    }

    @Override
    public String toString() {
        return    "\nnome: " + getNome()
                + "\nsaldo: R$ " + getSaldo()
                + "\nnumero: " + getNumero()
                + "\nagencia: " + getAgencia();
    }
}
