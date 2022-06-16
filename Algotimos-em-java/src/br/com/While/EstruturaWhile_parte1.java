package br.com.While;

import java.util.Objects;
import java.util.Scanner;

public class EstruturaWhile_parte1 {

    public static void main(String[] args) {
        String nome ;
        String sair ;
        
        int cont = 0;

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o Nome : ou S para sair");
            nome = scan.next();
            cont +=1;
            if (nome.equals("s")){
                break;
            }

        }
        System.out.println("Fim do Programa");


    }
}
