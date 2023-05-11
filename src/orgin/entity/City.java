package orgin.entity;

import java.util.Objects;

public record City(String name, Integer age) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(age, city.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
