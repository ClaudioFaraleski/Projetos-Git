package br.com.banco;

public class Main {
    public static void main(String[] args) {

        Banco cc = new Banco("cc");

       cc.depositar(100);
       cc.setCorrentista("claudio");

       System.out.println(cc.getCorrentista());
       System.out.println(cc.getSaldo());
    }
}
