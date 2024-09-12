package HomeWork3.Task1;

import HomeWork3.Task1.Classes.Book;
import HomeWork3.Task1.Classes.Magazine;
import HomeWork3.Task1.Interfaces.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());
        printables.add(new Magazine());
        printables.add(new Book());
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
