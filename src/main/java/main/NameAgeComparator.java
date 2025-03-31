package main;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student  o1, Student o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
