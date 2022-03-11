public class ContaCorrente extends ContaBancaria{
    private double taxaDeSaque;

    public void setTaxaDeSaque(double taxaDeSaque){
        this.taxaDeSaque = taxaDeSaque;
    }

    public void getTaxaDeSaque(){
        System.out.println(this.taxaDeSaque);
    }
    public void sacar(double valor){
        this.saldo = this.saldo - (valor + this.taxaDeSaque);
    }
}