
package lesson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Getter
@AllArgsConstructor
public class Dog {

    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравнение по ссылке
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

