package br.com.zup;

import br.com.zup.pessoa.Gerente;
import br.com.zup.telas.IO;
import br.com.zup.telas.Menu;

public class Control {
    private static boolean continuar = true;

    public static void executarSistema() throws Exception {
        while(continuar) {
            Menu.executarMenuPrincipal();
            int opcao = IO.lerDados().nextInt();
            validarMenu(opcao);
        }
    }
    public static void validarMenu(int opcao) throws Exception {
        if(opcao == 1) {
            Menu.executarMenuCadastrarGerente();
        } else if(opcao == 2) {
            Menu.executarMenuPesquisaGerente();
        } else if(opcao == 9) {
            continuar = false;
        }
    }
}
