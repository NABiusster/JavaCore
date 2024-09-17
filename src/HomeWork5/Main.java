package HomeWork5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ponderum");
        list.add("tantas");
        list.add("fit");
        list.add("fuisset");
        list.add("tantas");
        list.add("ult");
        list.add("quaestio");
        list.add("dicit");
        list.add("interesset");
        list.add("egestas");
        list.add("harum");
        list.add("neque");
        list.add("magnis");
        list.add("erat");
        list.add("facilis");
        list.add("conceptam");

        System.out.println("Sorted list");
        list.stream()
                .sorted().
                forEach(System.out::println);

        System.out.println("Filtered list");
        list.stream().
                filter(item -> (item.length() < 4))
                .forEach(System.out::println);

        ArrayList<Integer> digitList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            digitList.add(rand.nextInt(101));
        }
        System.out.println(
                digitList.stream()
                        .sorted(Comparator.comparingInt(digit -> digit))
                        .toList()
        );
        System.out.println(
                digitList.stream()
                        .filter(digit -> digit % 3 == 0)
                        .toList()
        );
        System.out.println(
                digitList.stream()
                        .filter(digit -> digit % 10 == 0)
                        .toList()
        );
        digitList.stream()
                .forEach(System.out::println);

        ArrayList <Integer> newList = new ArrayList<>(
                digitList.stream()
                        .map(digit->digit*3)
                        .toList()
        );
        System.out.println(newList);




    }
}
