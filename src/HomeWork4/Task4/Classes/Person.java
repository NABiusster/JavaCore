package HomeWork4.Task4.Classes;

import java.util.Objects;

public class Person {
    private String name;
    private int id;

    //Constructors
    //AllArg
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //NoArg
    public Person() {
    }

    //Getters & Setters
    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Methods

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
