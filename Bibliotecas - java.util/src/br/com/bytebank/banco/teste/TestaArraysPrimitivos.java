package br.com.bytebank.banco.teste;

public class TestaArraysPrimitivos {
    
    //Array []
    public static void main(String[] args) {
        
     // FORMA LITERAL
        int[] idades = {21,4,16,44,65};
        
        /*
        FORMA CLÁSSICA         
        int[] idades = new int[5];

        idades[0] = 21;
        idades[1] = 4;
        idades[2] = 16;
        idades[3] = 44;
        idades[4] = 65;
         */

        for (int i = 0; i < idades.length; i++)
            System.out.print(idades[i]+" ");

    }

}
