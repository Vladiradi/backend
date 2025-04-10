package lesson;
import  java.util.Arrays;
import java.util.HashSet;
import  java.util.List;
import java.util.Set;

public class TaskTwo {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(3, 4, 5, 6, 73, 5, 7, 8, 4, 6, 8);
        List<Integer> two = Arrays.asList(5, 3, 5, 6, 7, 4, 7, 85, 4, 7, 9);

        Set<Integer> set = new HashSet<>(one);
        Set<Integer> set2 = new HashSet<>(two);

        Set<Integer>  result = new HashSet<>(set);
        result.addAll(set2);
        Set<Integer> all = new HashSet<>(set);
        all.retainAll(set2);
        result.removeAll(all);

        System.out.println("Element that are not duplicated in both lists: " + result);


    }
}
