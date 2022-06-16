package br.com.entrada_de_dados;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite seu Nome :");
        nome = scan.nextLine();

        System.out.println("Digite Sua idade :");
        idade = scan.nextInt();

        System.out.println("Seu Nome é : "+nome);
        System.out.println("Sua Idade é : "+idade+"Anos");
    }
}
