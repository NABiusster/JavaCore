package HomeWork4.Task1;

import HomeWork4.Task1.Classes.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("User1",25));
        users.add(new User("User5",45));
        users.add(new User("User2",30));
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);
    }
}
