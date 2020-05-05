
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name == comparedPerson.name
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.birthday.getYear() == comparedPerson.birthday.getYear()
                && this.birthday.getMonth() == comparedPerson.birthday.getMonth()
                && this.birthday.getDay() == comparedPerson.birthday.getDay()) {
            return true;
        }

        return false;
    }
}
