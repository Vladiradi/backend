package main;

import java.util.ArrayList;
import java.util.List;

public class Concert<T extends Performer> {
    private List<T> performers = new ArrayList<>();

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public List<T> getPerformers() {
        return performers;
    }

    public void start() {
        System.out.println("Concert started, show your hands!");
        for (T performer : performers) {
            performer.perform();
        }
        System.out.println("Applause, please!");
    }
}

