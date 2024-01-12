package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaSerializacao {
    public static void main(String[] args) throws IOException{
        Cliente cliente = new Cliente();
        cliente.setCpf("02909381309");
        cliente.setNome("Constantino Moretti");
        cliente.setProfissao("Artista");

        ContaCorrente cc = new ContaCorrente(22, 33);
        cc.setTitular(cliente);
        cc.deposita(100.0);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

    }
}
