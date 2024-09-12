package HomeWork3.Task2.Classes;

import HomeWork3.Task2.Interfaces.Instrument;

public class Drum implements Instrument {
    private int size;

    //Constructors
    //AllArg
    public Drum(int size) {
        this.size = size;
    }

    //NoArg
    public Drum() {
    }

    //Getters & Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //Methods

    @Override
    public void play() {
        System.out.println("Грає барабан за розміром " + this.size);
    }
}
