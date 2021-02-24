package br.com.zup;

public class Main {

    public static void main(String[] args) throws Exception {

        ContaCorrente contaRicardo = new ContaCorrente("1000", "0024", 100, "Ricardo");
        ContaCorrente contaWesley = new ContaCorrente("2000", "0024", 30, "Wesley");

        try {
            System.out.println();
            System.out.println();

            contaWesley.transferirParaOutraConta(20, contaWesley);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
