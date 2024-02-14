package kolekcje.zadanie3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    //Na podstawie struktury klas uczniów w szkołach napisz mechanizm,
    // który zwróci wszystkich uczniów szkół. Stwórz mapę ze szkołami,
    // każda szkoła zawierać ma listę klas szkolnych,
    // a każda klasa szkolna powinna zawierać set uczniów.
    public static void main(String[] args) {
        Map<Integer, String> mapOfSchool = new HashMap<>();
        Student student1 = new Student("Adam", 10);
        Student student2 = new Student("Kasia", 9);

        ClassOfSchool classOfSchool1 = new ClassOfSchool();
        classOfSchool1.addStudent(student1);
        classOfSchool1.addStudent(student2);
        School school1 = new School("Podstawowa",1);

    }
    public static void printStudents(Set<Student> students){
        for (Student student :students){
            System.out.println(student.getName() + " "+ student.getAge());

        }
    }
}

