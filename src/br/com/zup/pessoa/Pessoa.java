package br.com.zup.pessoa;

public class Pessoa {

    private String nome, sobrenome, dataNascimento;
    private String CPF;

    public Pessoa() {}

    public Pessoa(String nome, String sobrenome, String dataNascimento, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "Nome: " + nome +
                "Sobrenome: " + sobrenome +
                "DataNascimento: " + dataNascimento;
    }
}
