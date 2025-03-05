package main;

public class DayofWeek {
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