import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<String> getStudentNames() {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University("National University");

        Student student1 = new Student("Jay");
        Student student2 = new Student("Jasmainelyn");

        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println("Students in " + university.getName() + ": " + university.getStudentNames());
    }
}
