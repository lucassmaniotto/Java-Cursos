import java.io.File;
//import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestaLeituraScanner {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(new File("contas.csv"));

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            
            String tipo = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.println(String.format(Locale.US, "%s -  %04d-%08d, %20s: R$ %.2f", 
                tipo, agencia, numero, titular, saldo));

            linhaScanner.close();

/* 
            String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
            //System.out.println(valores[3]); para imprimir o quarto item do array formado

*/
        }
        
        scanner.close();

    }
}
