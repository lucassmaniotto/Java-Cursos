public class CharTest {

    public static void main(String[] args){
        char letra = 65;
        System.out.println(letra);

        letra ++;
        System.out.println(letra);

        char valor = 66;
        valor = (char) (valor + 1);
        System.out.println(valor);

        String frase = "Isso é uma string e não um char";
        System.out.println(frase);
    }
    
}
