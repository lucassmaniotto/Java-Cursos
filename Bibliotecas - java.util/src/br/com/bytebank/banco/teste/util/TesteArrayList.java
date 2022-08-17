package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

    public static void main(String[] args) {
        
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 12);
        Conta cc3 = new ContaCorrente(22, 13);
        Conta cc4 = new ContaCorrente(22, 14);
        
        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Tamanho antes da remoção: " + lista.size());
        
        for(int i = 0 ; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        lista.remove(0);

        System.out.println("Tamanho depois da remoção: " + lista.size());

    /*  for i

        for(int i = 0 ; i < lista.size(); i++){
            System.out.println(lista.get(i));
        } 
    */

    //  for each

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}