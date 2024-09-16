package HomeWork4.Task3.Classes;


import HomeWork4.Task3.Enums.Gender;

import java.util.ArrayList;
import java.util.Objects;

public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

    //Constructors
    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;

    }

    //Getters & Setters
    //id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //surname
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Gender
    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    //Skills
    public ArrayList<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public void AddSkill(Skill skill) {
        this.skills.add(skill);
    }

    //Car
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    //Methods
    @Override
    public String toString() {
        return "\nUser{\n" +
                "    id=" + id +",\n"+
                "    name='" + name +",\n"+
                "    surname='" + surname +",\n"+
                "    email='" + email +",\n"+
                "    age=" + age +",\n"+
                "    gender=" + gender +",\n"+
                "    skills=" + skills +",\n"+
                "    car=" + car +",\n"+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && gender == user.gender && Objects.equals(skills, user.skills) && Objects.equals(car, user.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, age, gender, skills, car);
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}

