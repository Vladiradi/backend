package main;

public class City {
    private String title;
    public City(String title) {
        this.title = title;
    }
     public String getTitle() {
        return title;
     }
     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        if (title == null) return other.title == null;
        return title.equals(other.title);
     }
}