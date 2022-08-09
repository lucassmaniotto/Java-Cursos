public class TestaContas {
    
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100);

        Conta contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200);

        System.out.println("Corrente: " + contaCorrente.getSaldo() + "\n" + "Poupança: " + contaPoupanca.getSaldo());

        System.out.println("\nTransferência: CORRENTE -> POUPANÇA");
        contaCorrente.transfere(50, contaPoupanca);
        System.out.println(contaCorrente.getSaldo() + " -> " + contaPoupanca.getSaldo());
    }
}
