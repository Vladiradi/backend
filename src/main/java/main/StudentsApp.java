package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsApp {
    public static void main(String[] args) {
        Student alex = new Student("Alex", 25);
        Student oleg = new Student("Oleg", 20);
        Student max = new Student("Max", 18);
        Student max2 = new Student("Max", 22); // для проверки сортировки по возрасту при одинаковых именах

        List<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(oleg);
        students.add(max);
        students.add(max2);

        System.out.println("Before sort:");
        for (Student s : students) {
            System.out.println(s);
        }

//        Comparator<Student> comparator = new NameAgeComparator();
//        Collections.sort(students, comparator);


         Collections.sort(students, new NameAgeComparator());

        System.out.println("\nAfter sort by name, then age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}