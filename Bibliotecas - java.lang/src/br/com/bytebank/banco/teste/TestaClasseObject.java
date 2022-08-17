package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaClasseObject {
    public static void main(String[] args) {
        
/*      //Sobrecarga - mesmo método com valores diferentes
        System.out.println("x");
        System.out.println(3);
        System.out.println(false); */

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 44);
        Object cli = new Cliente();

        System.out.println(cc); //toString()
        System.out.println(cp); //toString()
        System.out.println(cli);

    }

}
