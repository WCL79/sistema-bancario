package br.com.zup;

import br.com.zup.pessoa.Pessoa;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements Transacao{
    private int diaRendimento;
    public ContaPoupanca(String numero, String agencia, double saldo, Pessoa pessoa) {
        super(numero, agencia, saldo, pessoa);
    }

    @Override
    public String toString() {
        return "-- Conta Poupança --"
                +super.toString();
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();
        diaRendimento = 24;
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            double valorComRendimento = this.getSaldo() * taxaRendimento;
            this.setSaldo(valorComRendimento);
            return true;
        }
        return false;
    }

}
