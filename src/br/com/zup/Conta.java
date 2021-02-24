package br.com.zup;

public abstract class Conta {
    protected double saldo;
    protected String numero, agencia, nome;

    public Conta(String numero, String agencia, double saldo, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
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
}
