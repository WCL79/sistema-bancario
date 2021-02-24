package br.com.zup;

import br.com.zup.pessoa.Analista;
import br.com.zup.pessoa.Pessoa;

public class Main {

    public static void main(String[] args) throws Exception {

        try {

            Analista analista1 = new Analista("Ricardo", "Alcantara", "22/02/1984",
                    "317.317.173-66", "Analista");

            analista1.cadastrarContaCorrente("1000", "2020", 0.0, analista1);

            System.out.println();








        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pularLinha() {
        System.out.println();
    }
}
