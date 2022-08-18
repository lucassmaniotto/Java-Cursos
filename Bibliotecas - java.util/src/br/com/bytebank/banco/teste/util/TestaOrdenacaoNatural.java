package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacaoNatural {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(33, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cp1 = new ContaPoupanca(22, 44);
        Cliente clienteCP1 = new Cliente();
        clienteCP1.setNome("Guilherme");
        cp1.setTitular(clienteCP1);
        cp1.deposita(244.0);

        Conta cc2 = new ContaCorrente(22, 11);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Paulo");
        cc2.setTitular(clienteCC2);
        cc2.deposita(111.0);

        Conta cp2 = new ContaPoupanca(22, 22);
        Cliente clienteCP2 = new Cliente();
        clienteCP2.setNome("Ana");
        cp2.setTitular(clienteCP2);
        cp2.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cp1);
        lista.add(cc2);
        lista.add(cp2);

        System.out.println("Desordenado"); //Desordenado
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println();

        Collections.sort(lista); // definido na classe conta como comparador padrão para comparações de Saldo

        System.out.println("Ordenado por saldo"); //Saldo
        for (Conta conta : lista) {
            System.out.println(conta + ", Saldo: " + conta.getSaldo());
        }
        System.out.println();


      Collections.sort(lista, new NumeroDaContaComparator());

        System.out.println("Ordenado por número de conta"); //Numero de Conta
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println();


        Collections.sort(lista, new AgenciaDaContaComparator());

        System.out.println("Ordenado por agência de conta"); //Agencia da Conta
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println();


        Collections.sort(lista, new TitularDaContaComparator());

        System.out.println("Ordenado por nome de titular da conta"); //Titular da conta
        for (Conta conta : lista) {
            System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
        }

    } 

}