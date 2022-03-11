abstract class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected String numero;

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }

    public void getTitular(){
        System.out.println(this.titular); 
    }
    public void getSaldo(){
        System.out.println(this.saldo); 
    }
    public void getNumero(){
        System.out.println(this.numero); 
    }

    public void sacar(double valor){
        this.saldo -= valor; 
    }
    public void depositar(double valor){
        this.saldo += valor;
    }



}
