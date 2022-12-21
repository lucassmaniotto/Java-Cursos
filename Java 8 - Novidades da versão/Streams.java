import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        System.out.println();

        Double average = courses.stream()           // OptionalDouble average = courses.stream()    
            .filter(c -> c.getStudents() >= 100)    // .filter(c -> c.getStudents() >= 100)  
            .mapToInt(Courese::getStudents)         // .mapToInt(Courese::getStudents) 
            .average()                              // .average();
            .getAsDouble();                         // print: OptionalDouble[131.5]

        System.out.println(average);

        System.out.println();

        courses.stream()
            .filter(c -> c.getStudents() >= 100)
            .findAny()
            .ifPresent(c -> System.out.println(c.getName()));

        System.out.println();
    
        // Stream<Courses> stream = courses.stream -> List<Courese> stream = courses.stream() 
        courses.stream()
            .filter(c -> c.getStudents() >= 100)
            .collect(Collectors.toList()) // a lista é criada e retornada para a variável courses
            .forEach(c -> System.out.println(c.getName()));

        System.out.println();

        courses.stream()
            //.filter(c -> c.getStudents() >= 100)
            .collect(Collectors.toMap(
                c -> c.getName(),
                c -> c.getStudents()
            ))
            .forEach((name, students) -> System.out.println(name + " has " + students + " students"));

        System.out.println();

    }
}