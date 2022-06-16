package br.com.operadores_logicos;

import java.util.Scanner;

public class OperadoeSwitch {

    public static void main(String[] args) {
        int menu ;
        System.out.println("1-abrir \n 2- fechar \n 3-ligar\n 4- desligar\n 5-sair\n");
        Scanner scan = new Scanner(System.in);
        menu = scan.nextInt();


        switch (menu) {
            case 1:
                System.out.println("A porta esta aberta");

                break;
            case 2:
                System.out.println("A porta esta fechada");
                break;
            case 3:
                System.out.println("Voce ligou o aparalho");
                break;
            case 4:
                System.out.println("Voce desligou o aparelho");
                break;
            case 5:
                System.out.println("saiu...");
                break;
            default:
                System.out.println("Opção Invalida");


      }
    }


}
