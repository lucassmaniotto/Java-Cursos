package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaWrappers {
    public static void main(String[] args) {
        
        // Compatibilidade com as coleções, nos permitindo, guardar números dentro de uma lista.

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); //devolve referência -> Autoboxing
        int idadeValor = idadeRef.intValue(); // devolve primitivo -> Unboxing

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing: faz por de baixo dos panos
        numeros.add(idade); // !!não deveria funcionar 
        numeros.add(idadeValor); //   porque não é uma referência!!
        numeros.add(idadeRef); // é referência, pois internamente o Java transforma o primitivo em um objeto, e armazena a referência no array.

        for (Integer integer : numeros) {
            System.out.print(integer + " = ");
        }

        // Transformar String em um int -> parsing
        String s = "29";
        Integer num = Integer.valueOf(s); //funciona mas é referência
        //ou
        int numDireto = Integer.parseInt(s); //melhor prática
        System.out.println(num + " = " + numDireto);
        
        // Transformar um Integer em outros primitivos
        System.out.println("---------------------------");
        System.out.println(idadeRef.doubleValue() + " é um double agora");

        // Para regra de negócios
        System.out.println("---------------------------");
        System.out.println("Integer possui intervalo de " + Integer.MIN_VALUE + " à " + Integer.MAX_VALUE + " inteiros,");
        System.out.println(Integer.SIZE + " Bits" + ",");
        System.out.println("e " + Integer.BYTES+ " Bytes :)");
    }
}
