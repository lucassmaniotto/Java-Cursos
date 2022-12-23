package br.com.alura;

//import java.util.List;

import br.com.alura.Objects.Course;
import br.com.alura.Objects.Lesson;

public class CollectionRelationships {
    public static void main(String[] args) {
        Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");
        
        /* 
        javaCollections
            .getLessons()
            .add(new Lesson("Trabalhando com ArrayList", 21));
         */

        javaCollections.addLesson(new Lesson("Trabalhando com ArrayList", 21));
        // javaCollections.getLessons().add(new Lesson("Criando uma aula", 20)); -> com unmodifiableList não é possível adicionar dessa forma
        javaCollections.addLesson(new Lesson("Criando uma aula", 20));
        javaCollections.addLesson(new Lesson("Modelando com coleções", 22));

        javaCollections.getLessons()
            .forEach(l -> System.out.printf("Aula %d: %s - %s minutos%n", 
                javaCollections.getLessons().indexOf(l) + 1, l.getName(), l.getTime()
            ));
    }
}
