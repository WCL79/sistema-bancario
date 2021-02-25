package br.com.zup;

public class Main {

    public static void main(String[] args) throws Exception {

        try {

            Control.executarSistema();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
