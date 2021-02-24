package br.com.zup;

import br.com.zup.pessoa.Analista;
import br.com.zup.pessoa.Funcionario;
import br.com.zup.pessoa.Gerente;
import br.com.zup.pessoa.Pessoa;
import br.com.zup.telas.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        try {

            Menu.executarMenuPrincipal();
            //Gerente franklin = new Gerente("Franklin", "Souza", "23/07/1991", "222.222.222-23", "Gerente");

            //franklin.cadastrarFuncionario("Wesley", "Souza", "23/07/1991", "222.222.222-23", "Analista");











        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void pularLinha() {
        System.out.println();
    }
}
