package br.com.banco;

public class Banco {


    public String conta ;
    protected String tipo;
    private String correntista;
    private double saldo;
    private boolean status;

    @Override
    public String toString() {
        return "Banco{" +
                "conta='" + conta + '\'' +
                ", tipo='" + tipo + '\'' +
                ", correntista='" + correntista + '\'' +
                ", saldo=" + saldo +
                ", status=" + status +
                '}';
    }

    public Banco(String conta) {
        this.conta = conta;
        saldo = 0;
        status = false;

    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void AbrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "cc") {
            setSaldo(50);
        }else if(t == "cp"){
            setSaldo(150);
        }
    }
    public  void FecharConta(){

        if(saldo > 0){
            System.out.println("saldo em conta");
        }else if(saldo < 0){
            System.out.println("Conta negativa");
        }else{
            setStatus(false);
        }

    }
    public void depositar(double v){

        saldo = saldo + v;

    }

    public void sacar(double v){

       if (saldo > v){
           saldo = saldo -v;
       }else{
           System.out.println("Saldo insuficiente");
       }

    }

    public void PagarMensalidade(){

    }
}
