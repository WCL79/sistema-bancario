package br.com.zup.telas;

import java.util.Scanner;

public class IO {
    public static Scanner lerDados(){
        return new Scanner(System.in);
    }

    public static void escreverDados(String mensagem){
        System.out.println(mensagem);
    }
}
