package br.com.While;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x ;
        System.out.println("Digite a Tabuada :");
        x = scan.nextInt();


        int cont = 0;

        while (cont <=10){

            if(x>10){
                System.out.println("Tabuada não existe");
                break;
            }else{
            System.out.println(+cont +"x"+x+"="+(x*cont));
            cont+=1;
        }}


    }
}
