package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TestaGuardadorDeReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 12);
        Conta cc3 = new ContaCorrente(22, 13);
        Cliente cliente = new Cliente();
        cliente.setNome("Darth Vader");

        guardador.adiciona(cc);
        guardador.adiciona(cc2);
        guardador.adiciona(cc3);
        guardador.adiciona(cliente);
    
        int tamanho = guardador.getQuantidadeDeElemento();
        System.out.println(tamanho);

        Object ref = guardador.getReferencia(3);
        System.out.println(ref);
        System.out.println(guardador.getReferencia(2));
    }


}
