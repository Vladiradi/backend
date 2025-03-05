package main;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        // Используем перечисления DayOfWeek вместо создания объектов через new
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.TUESDAY;
        Student student = new Student(day1, day2);

        DayOfWeek day3 = DayOfWeek.FRIDAY;
        boolean b = student.isGoStudy(day3);
        System.out.println(b); // Должно вывести false, так как пятница не в расписании
    }
}