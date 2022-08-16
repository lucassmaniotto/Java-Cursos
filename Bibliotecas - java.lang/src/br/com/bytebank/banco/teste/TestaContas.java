package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {
    
    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100);

        Conta contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200);

        Conta contaEspecial = new ContaEspecial(333, 333);
        contaEspecial.deposita(300);
        //contaX.saldo não funciona

        System.out.println("Corrente: " + contaCorrente.getSaldo() + "\n" + "Poupança: " + contaPoupanca.getSaldo());

        System.out.println("\nTransferência: CORRENTE -> POUPANÇA");
        contaCorrente.transfere(50, contaPoupanca);
        System.out.println(contaCorrente.getSaldo() + " -> " + contaPoupanca.getSaldo());
    }
}
