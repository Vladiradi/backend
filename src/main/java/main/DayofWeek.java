package main;

public class DayofWeek {
    private String dayOfWeek;
    private DayOfWeek(String nameOfTheDay)
    this.nameOfTheDay = nameOfTheDay;

}

@Override
public boolean equals(Object o){
    if(o instanceof DayOfWeek){
        if(this.nameOfTheDay.equals(((DayOfWeek) o).nameOfTheDay)){
            return true;
        } else {
            return false;
        }
    } else {
        return false;
    }
}g