package HomeWork4.Task2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Alex");
        users.add("Bob");
        users.add("Charlie");
        users.add("David");
        users.add("Emma");
        users.sort(Comparator.comparing(String::length));
        System.out.println(users);
    }
}
