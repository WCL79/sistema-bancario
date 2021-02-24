package br.com.zup;

public class Main {

    public static void main(String[] args) throws Exception {

        Conta ccRicardo = new ContaCorrente("1000", "0010", 0.0, "Ricardo");
        Conta ccWesley = new ContaCorrente("2000", "0020", 0.0, "Wesley");

        Conta cpRicardo = new ContaPoupanca("1234", "0030", 0.0, "Ricardo");
        Conta cpWesley = new ContaPoupanca("2345", "0040", 0.0, "Wesley");

        try {
            pularLinha();
            pularLinha();

            // Mostrando as contas corrente
            System.out.println(ccWesley);
            pularLinha();
            System.out.println(ccRicardo);
            pularLinha();

            // Depositando nas contas corrente
            ccWesley.depositarNaConta(10000.00);
            ccRicardo.depositarNaConta(5000.00);

            // Saldo após o depósito
            System.out.println("Foi depositado R$ 10.000,00 na conta corrente do Wesley" +
                               " e R$ e 5.000,00 na conta corrente do Ricardo.\n" +
                               "Saldo das contas após o depósito");
            pularLinha();
            System.out.println("Saldo Conta Wesley: " + ccWesley.getSaldo());
            System.out.println("Saldo Conta Ricardo: " + ccRicardo.getSaldo());

            // Sacar das contas corrente
            ccWesley.sacarDaConta(2000.00);
            ccRicardo.sacarDaConta(1500.00);
            pularLinha();

            // Saldo após o saque
            System.out.println("Foi sacado R$ 2.000,00 da conta corrente do Wesley" +
                               " e R$ e 1.500,00 da conta corrente do Ricardo.\n" +
                               "Saldo das contas após o saque");
            pularLinha();
            System.out.println("Saldo Conta Wesley: " + ccWesley.getSaldo());
            System.out.println("Saldo Conta Ricardo: " + ccRicardo.getSaldo());
            pularLinha();

            // Transferência entre contas
            ccWesley.transferirParaOutraConta(3000.00, ccRicardo);
            System.out.println("Foi transferido R$ 3.000,00 reais da conta corrente do Wesley para " +
                               "conta corrente do Ricardo\n" +
                               "Saldo das contas após a transferência");
            pularLinha();
            System.out.println("Saldo Conta Wesley: " + ccWesley.getSaldo());
            System.out.println("Saldo Conta Ricardo: " + ccRicardo.getSaldo());
            pularLinha();

            // Mostrando as contas poupança
            System.out.println(cpWesley);
            pularLinha();
            System.out.println(cpRicardo);
            pularLinha();

            // Transferência de conta corrente para conta poupança
            ccRicardo.transferirParaOutraConta(2000.00, cpRicardo);

            // Saldo da conta poupança após a transferência
            System.out.println(cpRicardo);
            pularLinha();

            // Depósito na conta poupança do Wesley
            cpWesley.depositarNaConta(4500.00);

            // Saldo da conta poupança após o depósito
            System.out.println(cpWesley);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pularLinha() {
        System.out.println();
    }
}
