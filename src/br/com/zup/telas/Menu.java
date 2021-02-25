package br.com.zup.telas;

import br.com.zup.pessoa.Gerente;

public class Menu {

    public static void executarMenuPrincipal() {
        IO.escreverDados("\n\n------------------------------------------------------------------- SISTEMA BANCÁRIO --------------------------------------------------------------------\n\n\n");
        IO.escreverDados("Seja bem vindo!\n\n");
        IO.escreverDados(" 1 Para cadatrar gerente\n");
        IO.escreverDados(" 2 Para consultar gerente\n");
        IO.escreverDados(" 3 Para cadastrar funcionário\n");
        IO.escreverDados(" 4 Para consultar funcionário\n");
        IO.escreverDados(" 5 Para cadadastrar uma conta\n");
        IO.escreverDados(" 6 Para consultar uma conta\n");
        IO.escreverDados(" 9 Para do SAIR do Sistema\n");
    }

    public static void executarMenuCadastrarGerente() {
        IO.escreverDados("Você está no Cadastro de Gerente\n\n");
        IO.escreverDados("Digite o nome: ");
        String nome = IO.lerDados().nextLine();
        IO.escreverDados("Digite o sobrenome: ");
        String sobrenome = IO.lerDados().nextLine();
        IO.escreverDados("Digite data de nascimento: ");
        String dataNascimento = IO.lerDados().nextLine();
        IO.escreverDados("Digite o CPF: ");
        String CPF = IO.lerDados().nextLine();

        Gerente gerente = new Gerente();
        gerente.cadastrarGerente(nome, sobrenome, dataNascimento, CPF);
    }

    public static void executarMenuPesquisaGerente() throws Exception {
        IO.escreverDados("Digite o nome do gerente: ");
        String nome = IO.lerDados().nextLine();

        System.out.println(Gerente.pesquisarGerentePeloNome(nome));
    }
}
