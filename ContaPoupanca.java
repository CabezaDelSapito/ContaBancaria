public class ContaPoupanca extends ContaBancaria{
    private double jurosDeDeposito;

    public void setJurosDeDeposito(double jurosDeDeposito){
        this.jurosDeDeposito = jurosDeDeposito;
    }

    public void getJurosDeDeposito(){
        System.out.println(this.jurosDeDeposito);
    }
    public void depositar(double valor){
        this.saldo = this.saldo + (valor - this.jurosDeDeposito);
    }
}
