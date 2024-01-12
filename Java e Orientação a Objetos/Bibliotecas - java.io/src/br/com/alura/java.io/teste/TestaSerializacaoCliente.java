import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestaSerializacaoCliente{

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setCpf("02909381309");
        cliente.setNome("Constantino Moretti");
        cliente.setProfissao("Artista");

/*
 
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente2 = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente2.getNomeCpfProfissao());

    }
}