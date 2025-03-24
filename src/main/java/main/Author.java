package main;

public class Author {
    private String name;
    private int age;
    private City city;
    public Author(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public City getCity() {
        return city;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author other = (Author) obj;
        if (age != other.age) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (city == null) {
            return other.city == null;
        } else {
            return city.equals(other.city);
        }
    }
}
