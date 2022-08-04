package Objects;
public class CriaConta {
    public static void main(String[] args) {
        /*
            Sem Atributo Privado na classe Conta
        //instanciação
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Primeira conta = " + primeiraConta.saldo + "\n" + "Segunda conta = " + segundaConta.saldo);
        System.out.println();

        //deposito
        System.out.print("**Depósito de 50 na Segunda conta**\nValor atual da Segunda conta = ");
        segundaConta.deposita(50);
        System.out.println(segundaConta.saldo);
        System.out.println();

        //saque
        System.out.print("**Saque de 250 na Primeira conta**\nValor atual da Primeira conta = " + primeiraConta.saldo + "\n");
        primeiraConta.saca(250);
        System.out.println("**Saque de 150 na Primeira conta**");
        primeiraConta.saca(150);
        System.out.println("Valor atual da Primeira conta = " + primeiraConta.saldo); 
        System.out.println();
        
        //transfere
        System.out.println("**Transferência de 50 p/ Primeira conta**");
        segundaConta.transfere(50, primeiraConta);
        System.out.println("Valor atual da Primeira conta = " + primeiraConta.saldo);
        System.out.println("**Transferência de 100 p/ Primeira conta**");
        segundaConta.transfere(100, primeiraConta);
        */

        //instanciação
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        Conta segundaConta = new Conta();
        segundaConta.deposita(50);
        System.out.println("Primeira conta = " + primeiraConta.informaSaldo() + "\n" + "Segunda conta = " + segundaConta.informaSaldo());
        System.out.println();

        //deposito
        System.out.print("**Depósito de 50 na Segunda conta**\nValor atual da Segunda conta = ");
        segundaConta.deposita(50);
        System.out.println(segundaConta.informaSaldo());
        System.out.println();

        //saque
        System.out.print("**Saque de 250 na Primeira conta**\nValor atual da Primeira conta = " + primeiraConta.informaSaldo() + "\n");
        primeiraConta.saca(250);
        System.out.println("**Saque de 150 na Primeira conta**");
        primeiraConta.saca(150);
        System.out.println("Valor atual da Primeira conta = " + primeiraConta.informaSaldo()); 
        System.out.println();
        
        //transfere
        System.out.println("**Transferência de 50 p/ Primeira conta**");
        segundaConta.transfere(50, primeiraConta);
        System.out.println("Valor atual da Primeira conta = " + primeiraConta.informaSaldo());
        System.out.println("**Transferência de 100 p/ Primeira conta**");
        segundaConta.transfere(100, primeiraConta);
    }
}