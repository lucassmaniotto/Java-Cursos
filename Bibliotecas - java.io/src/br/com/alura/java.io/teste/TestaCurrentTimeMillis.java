import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaCurrentTimeMillis {
    
    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis(); //medir o tempo de execução de algum trecho de código

        BufferedWriter bw = new BufferedWriter(new FileWriter("loremMillis.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        bw.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
    
}
