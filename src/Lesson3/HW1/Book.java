package Lesson3.HW1;

import lombok.Data;

@Data
public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("This is a Book");
    }
}
