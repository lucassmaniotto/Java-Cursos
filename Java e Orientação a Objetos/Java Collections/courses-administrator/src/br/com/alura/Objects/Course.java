package br.com.alura.Objects;

// import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {
    private String name;
    private String instructor;
    private List<Lesson> lessons = new LinkedList<>();

    public Course(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public List<Lesson> getLessons() {
        return Collections.unmodifiableList(lessons);
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }
}
