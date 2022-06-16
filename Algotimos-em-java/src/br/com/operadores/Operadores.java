package br.com.operadores;

public class Operadores {

    public static void main(String[] args) {

        Integer num = 1;
        Double num_1 = 2.2;


        System.out.println("Soma dos Numeros :"+num + num_1);
        System.out.println("Subtração dos Numeros : "+ String.format("%2f",(num - num_1)));
        System.out.println("Multiplicação dos Numeros :"+num * num_1);
        System.out.println("A Divisão dos Numeros :"+ String.format("%.2f",num / num_1));
        System.out.println("O Resta da Divisão"+num % num_1);




    }
}
