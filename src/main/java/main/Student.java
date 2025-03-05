package main;
import java.time.DayOfWeek;

public class Student {

    private DayOfWeek[] learningDays = new DayOfWeek[2];

    public Student(DayOfWeek firstDay, DayOfWeek secondDay) {
        learningDays[0] = firstDay;
        learningDays[1] = secondDay;
    }

    public boolean isGoStudy(DayOfWeek day) {
        for (DayOfWeek dayOfWeek : learningDays) {
            if (dayOfWeek.equals(day)) {
                return true;
            }
        }
        return false;
    }
}