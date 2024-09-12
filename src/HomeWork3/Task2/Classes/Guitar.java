package HomeWork3.Task2.Classes;

import HomeWork3.Task2.Interfaces.Instrument;

public class Guitar implements Instrument {
    private int stringCount;

    //Constructors
    //NoArg
    public Guitar() {
    }

    //AllArg
    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    //Getters & Setters
    //stringCount
    public int getStringCount() {
        return this.stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }
    //methods

    @Override
    public void play() {
        System.out.println("Грає гітара з " + this.stringCount + " струнами.");
    }
}
