import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscritaFileWriter {
    public static void main(String[] args) throws IOException {
/* 
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

 */        
        BufferedWriter bw = new BufferedWriter(new FileWriter("starwars.txt"));
        bw.write("          Episode IV:");
        bw.write(System.lineSeparator()); //garante pular linha em qualquer SO
        bw.write("          A NEW HOPE");
        bw.newLine();
        bw.newLine();
        bw.write("It's a period of civil war. Rebel");
        bw.newLine();
        bw.write("spaceships, striking from a");
        bw.newLine();
        bw.write("hidden base, have won their");        
        bw.newLine();
        bw.write("first victory against the evil");

        bw.close();
    }  
}
