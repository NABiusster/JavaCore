package HomeWork3.Task1.Classes;

import HomeWork3.Task1.Interfaces.Printable;

public class Magazine implements Printable {
    //Constructors
    public Magazine(){}
    //Methods

    @Override
    public void print() {
        System.out.println("Magazine");
    }
}
