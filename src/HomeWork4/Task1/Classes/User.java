package HomeWork4.Task1.Classes;

import java.util.Objects;

public class User {
    private String name;
    private  int age;
    //Constructors
    //AllArg
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getters &Setters
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

    //Methods
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
