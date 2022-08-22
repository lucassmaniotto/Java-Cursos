import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestaEscritaPrintWriter {
    public static void main(String[] args) throws IOException {
/*       
        PrintStream ps = new PrintStream(new File("lorem2.txt"));
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("id est laborum.");

        ps.close();
*/    
        PrintWriter pw = new PrintWriter(new File("lorem2.txt"));
        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println();
        pw.println("id est laborum.");

        pw.close();

        //PrintWriter = PrintStream

    }  
}