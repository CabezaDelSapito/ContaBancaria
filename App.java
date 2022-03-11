public class App {
    public static void main(String[] args) throws Exception {
    
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.setTitular("Fulano");
        contaCorrente.setSaldo(1000.00);
        contaCorrente.setNumero("ABC123");

        contaPoupanca.setTitular("Fuxico");
        contaPoupanca.setSaldo(5000.00);
        contaPoupanca.setNumero("DEF456");

        contaCorrente.setTaxaDeSaque(15.00);
        contaPoupanca.setJurosDeDeposito(10.00);

        contaCorrente.getTitular();
        contaCorrente.getSaldo();
        contaCorrente.getNumero();
        contaCorrente.sacar(50);
        contaCorrente.getSaldo();
        
        contaPoupanca.getTitular();
        contaPoupanca.getSaldo();
        contaPoupanca.getNumero();
        contaPoupanca.depositar(50);
        contaPoupanca.getSaldo();
    }
}
