package HomeWork3.Task1.Classes;

import HomeWork3.Task1.Interfaces.Printable;

public class Book implements Printable {
    //Constructors
    public Book() {
    }

    @Override
    public void print() {
        System.out.println("Book");
    }
}
