package HomeWork5.Task3.Classes;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int drivingExperience;

    //Constructors
    //noArg
    public Person() {
    }

    //AllArg
    public Person(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    //Getters & Setters
    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //drivingExperience
    public int getDrivingExperience() {
        return this.drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    //Methods
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", drivingExperience=" + drivingExperience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && drivingExperience == person.drivingExperience && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, drivingExperience);
    }
}
