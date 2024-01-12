import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
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
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() < s2.length())
                    return -1;
                if (s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });
        System.out.println(words);
        
        // Formas de iteração
        words.forEach(new Consumer<String>() {  
            @Override                                        
            public void accept(String s) {      
                System.out.println(s);          
            } 
        });                                              

        System.out.println();

        // Lambda
        words.forEach(string -> System.out.println(string));

        // Interface funcional
        words.sort((s1, s2) ->  Integer.compare(s1.length(), s2.length())); 
        /* == */ 
        words.sort(Comparator.comparing(s -> s.length()));
        words.sort(Comparator.comparing(String::length));
        /* 
         Function<String, Integer> function = s -> s.length();
         Comparator<String> comparator = Comparator.comparing(function);
         words.sort(comparator);
        */

        System.out.println(words);

    }
}