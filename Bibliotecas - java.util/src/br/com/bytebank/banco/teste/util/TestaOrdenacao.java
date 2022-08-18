package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacao {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(33, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(222.0);

        Conta cp1 = new ContaPoupanca(22, 44);
        Cliente clienteCP1 = new Cliente();
        clienteCP1.setNome("Guilherme");
        cp1.setTitular(clienteCP1);
        cp1.deposita(444.0);

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

        System.out.println("Desordenado");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println();

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(new NumeroDaContaComparator());

        System.out.println("Ordenado por número de conta");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println();

        lista.sort(new AgenciaDaContaComparator());

        System.out.println("Ordenado por agência de conta");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println();

        //TitularDaContaComparator titularComparator = new TitularDaContaComparator();
        lista.sort(new TitularDaContaComparator());

        System.out.println("Ordenado por nome de titular da conta");
        for (Conta conta : lista) {
            System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
        }

    }


}

class AgenciaDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getAgencia(), c2.getAgencia());
    }
    
}

class NumeroDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());

        // return c1.getNumero() - c2.getNumero();

        /* 
        if(c1.getNumero() < c2.getNumero())
            return -1;
        if(c1.getNumero() > c2.getNumero())
            return 1;
        return 0; 
        */
    }
    
}

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        
        return nomeC1.compareTo(nomeC2);
        
    }
    
}