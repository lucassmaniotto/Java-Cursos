package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayObject {
    public static void main(String[] args) {
        
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());

        //Conta referencia = conta[1];
        ContaPoupanca referencia = (ContaPoupanca) contas[1];

        System.out.println(cc2.getNumero());
        System.out.println(referencia.getNumero());

        //======//
        
        Cliente clienteNormal = new Cliente();
        clienteNormal.setNome("Flavio");

        Cliente clienteVip = new Cliente();
        clienteVip.setNome("Romulo");

        Object[] refs = new Object[5];
        refs[0]  = clienteNormal;
        refs[1]  = clienteVip;

        System.out.println(((Cliente) (refs[1])).getNome());//typecast
    }
}

