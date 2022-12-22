package br.com.alura;

public class Lesson implements Comparable<Lesson> {
    private String name;
    private int time;

    public Lesson(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }	

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Lesson otherLesson) {
        return this.name.compareTo(otherLesson.name);
    }

    @Override
    public String toString() {
        return "Lesson: " + this.name + " -  Time: " + this.time;
    }

}
