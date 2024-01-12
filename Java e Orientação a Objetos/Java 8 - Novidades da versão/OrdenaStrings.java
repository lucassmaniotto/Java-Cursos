import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args){
        List<String> words = new ArrayList<String>();
        words.add("Paralelepípedo");
        words.add("Cachorro");
        words.add("Gato");
        words.add("Elefante");

        // Ordem lexicográfica
        Collections.sort(words);
        System.out.println(words);

        // Ordem de tamanho de caracteres
        Comparator<String> comparator = new ComparadorPorTamanho();
        words.sort(comparator);    /* Collections.sort(words, comparator); */
        System.out.println(words); // default methods: interfaces podem ter implementações

            // Formas de iteração - default methods
            Consumer<String> consumer = new ImprimeNaLinha(); // for (String word : words) {
            words.forEach(consumer);                           // System.out.println(word);
                                                             // }
    }
}