package HomeWork2.Task4;

import java.util.ArrayList;

import static HomeWork2.Task4.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));
        User user = new User(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                MALE,
                skills,
                new Car("toyota", 2021, 250));
        System.out.println(user);
    }
}
