import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Courese {
    private String name;
    private int students;
    public Courese(String name, int students) {
        this.name = name;
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public int getStudents() {
        return students;
    }
}

public class Streams {
    public static void main(String[] args) {
        List<Courese> courses = new ArrayList<Courese>();
        courses.add(new Courese("Python", 45));
        courses.add(new Courese("JavaScript", 150));
        courses.add(new Courese("Java", 113));
        courses.add(new Courese("C", 55));

        courses.sort(Comparator.comparing(Courese::getStudents));
    
        courses.stream()
            .filter(c -> c.getStudents() >= 100)
            .map(Courese::getStudents)
            .forEach(System.out::println);

        Double average = courses.stream()
            .filter(c -> c.getStudents() >= 100)
            .mapToInt(Courese::getStudents)
            .average()
            .getAsDouble();

        System.out.println(average);
    }
}