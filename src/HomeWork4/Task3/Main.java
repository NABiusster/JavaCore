package HomeWork4.Task3;

import HomeWork4.Task3.Classes.Car;
import HomeWork4.Task3.Classes.Skill;
import HomeWork4.Task3.Classes.User;
import HomeWork4.Task3.Enums.Gender;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Skill> skills = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                skills.add(new Skill("skill" + j, j ));
            }
            users.add(new User(i,
                    "User" + i,
                    "Surname" + i,
                    "usr" + i + "@asd.com",
                    30 + i,
                    i % 2 == 0 ? Gender.FEMALE : Gender.MALE,
                    skills,
                    new Car("Model" + i, 2014 + i, i)));
        }
        System.out.println("Full Hashset");
        System.out.println(users);
        TreeSet<User> treeSetUsers = new TreeSet<>(users);
        users.removeIf(user -> user.getGender() == Gender.MALE);
        System.out.println("\nFemale Hashset");
        System.out.println(users);
        System.out.println("\nTreeSet");
        System.out.println(treeSetUsers);
    }
}
