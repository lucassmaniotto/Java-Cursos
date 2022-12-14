package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        String topic1 = "Conhecendo mais de listas";
        String topic2 = "Modelando a classe Aula";
        String topic3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> courses = new ArrayList<>();
        courses.add(topic1);
        courses.add(topic2);
        courses.add(topic3);

        printList(courses);

        System.out.println();

        // Ordem lexicográfica
        courses.add("Aumentando nosso conhecimento");
        Collections.sort(courses);
        printList(courses);
    }

    private static void printList(ArrayList<String> courses) {
        courses.forEach(c -> System.out.printf("Aula %s: %s", 
                Integer.toString(courses.indexOf(c) + 1), c + "\n"
        ));
    }
}