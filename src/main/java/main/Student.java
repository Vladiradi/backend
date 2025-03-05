package main;

public class Student {
    private Day[] learningDays = new Day[2];

    public Student(Day firstDay, Day secondDay) {
        learningDays[0] = firstDay;
        learningDays[1] = secondDay;
    }
}