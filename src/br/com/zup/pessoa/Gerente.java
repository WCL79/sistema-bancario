package br.com.zup.pessoa;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    public static List<Gerente> listaGerente = new ArrayList<>();

    public Gerente() {}

    public Gerente(String nome, String sobrenome, String dataNascimento, String CPF, String cargo) {
        super(nome, sobrenome, dataNascimento, CPF, cargo);
    }

    public void cadastrarGerente(String nome, String sobrenome, String dataNascimento, String CPF) {
        Gerente gerente = new Gerente(nome, sobrenome, dataNascimento, CPF, "Gerente");
        listaGerente.add(gerente);
    }

    public boolean cadastrarFuncionario(String nome, String sobrenome, String dataNascimento, String CPF, String cargo){
        try {
            Funcionario funcionario = new Analista(nome, sobrenome, dataNascimento, CPF, cargo);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static Gerente pesquisarGerentePeloNome(String nome) throws Exception {
        Gerente gerentePesquisado = null;
        for(Gerente gerente : listaGerente) {
            if(gerente.getNome().equalsIgnoreCase(nome)) {
                gerentePesquisado = gerente;
            } else {
                throw new Exception("Gerente não cadastrado!");
            }
        }

        return gerentePesquisado;
    }
}
