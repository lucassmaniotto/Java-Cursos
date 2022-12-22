package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ObjectLists {
    public static void main(String[] args) {
        Lesson lesson1 = new Lesson("Revisitando as ArrayLists", 21);
        Lesson lesson2 = new Lesson("Listas de objetos", 20);
        Lesson lesson3 = new Lesson("Relacionamento de listas e objetos", 19);

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);

        System.out.println(lessons);

        printObjectList(lessons);

        System.out.println();

        // Ordem lexicográfica
        Collections.sort(lessons);
        printObjectList(lessons);

        System.out.println();

        // Ordem por tempo
        Collections.sort(lessons, Comparator.comparing(Lesson::getTime));
        printObjectList(lessons);
    }

    public static void printObjectList(ArrayList<Lesson> lessons) {
        lessons.forEach(l -> System.out.printf("Aula %s: %s - %s minutos%n", 
                Integer.toString(lessons.indexOf(l) + 1), l.getName(), l.getTime()
        ));
    }
}