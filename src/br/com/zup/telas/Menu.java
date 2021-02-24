package br.com.zup.telas;

public class Menu {
    public static void executarMenuPrincipal() {
        StringBuilder model = new StringBuilder();
        model.append("\n\n------------------------------------------------------------------- SISTEMA BANCÁRIO --------------------------------------------------------------------\n\n\n");
        model.append("Seja bem vindo!\n\n");
        model.append(" 1 Para cadatrar gerente\n");
        model.append(" 2 Para cadastrar funcionário\n");
        model.append(" 3 Para cadadastrar uma conta\n");
        model.append(" 4 Para consultar uma conta\n");
        model.append(" 9 Para do SAIR do Sistema\n");
        System.out.println(model);
    }
}
