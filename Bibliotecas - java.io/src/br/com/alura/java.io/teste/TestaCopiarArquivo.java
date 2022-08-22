import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestaCopiarArquivo{
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        InputStream fis =  s.getInputStream(); //<- rede //new FileInputStream("lorem.txt"); arquivo //System.in; teclado
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream(); //<- rede //new FileOutputStream("lorem_copy.txt"); arquivo //System.out; teclado
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        String line = br.readLine();

        while(line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }

         br.close();
         bw.close();
         s.close();
    }
}