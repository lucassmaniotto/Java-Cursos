package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArraysReferencias {
    
    public static void main(String[] args) {
        
        ContaCorrente[] contasCorrentes = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        contasCorrentes[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contasCorrentes[1] = cc2;

        ContaCorrente referencia = contasCorrentes[0];

        System.out.println(contasCorrentes[1].getNumero());
        System.out.println(referencia.getNumero());
    }

}
