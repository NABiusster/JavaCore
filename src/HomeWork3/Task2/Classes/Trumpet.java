package HomeWork3.Task2.Classes;

import HomeWork3.Task2.Interfaces.Instrument;

public class Trumpet implements Instrument {
    private int diameter;

    //Constructors
    //NoArg
    public Trumpet() {
    }

    //AllArg
    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    //Getters & Setters
    //diameter
    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    //methods

    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + this.diameter);
    }
}
