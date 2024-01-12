package br.com.bytebank.banco.teste;

public class TestaString {
    public static void main(String[] args) { 

/*  ENTRADA

         String vazio = "";
        System.out.println(vazio.isEmpty());

        String espaco = "                sem espaço";
        System.out.println(espaco.trim());

        String nome = "Lucas";
        System.out.println(nome.contains("ucas"));

        String outra = nome.replace("L", "l");

        String diferente = nome.replace("Lu", "lU");

        String maisUma = nome.toUpperCase();

        char c = nome.charAt(1);

        int d = nome.indexOf("as");

        String e = nome.substring(1);

        int f = nome.length();

        System.out.println(nome);
        System.out.println(outra);
        System.out.println(diferente);
        System.out.println(maisUma);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        for(int i = 0; i < nome.length(); i++)
            System.out.println(nome.charAt(i));

    SAIDA

    true
    sem espaço
    true      
    Lucas     
    lucas     
    lUcas     
    LUCAS     
    u
    3
    ucas      
    5
    L
    u
    c
    a
    s
 */

    
    String texto = "Socorram";
    texto = texto.concat("-");
    texto = texto.concat("me");
    texto = texto.concat(", ");
    texto = texto.concat("subi ");
    texto = texto.concat("no ");
    texto = texto.concat("ônibus ");
    texto = texto.concat("em ");
    texto = texto.concat("Marrocos");
    System.out.println(texto); 

    StringBuilder builder = new StringBuilder("Socorram");
    builder.append("-");
    builder.append("me");
    builder.append(", ");
    builder.append("subi ");
    builder.append("no ");
    builder.append("ônibus ");
    builder.append("em ");
    builder.append("Marrocos");
    String textoStringBuilder = builder.toString();
    System.out.println(textoStringBuilder);
    

    }
    
    

}

