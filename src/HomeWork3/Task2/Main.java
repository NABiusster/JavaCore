package HomeWork3.Task2;

import HomeWork3.Task2.Classes.Drum;
import HomeWork3.Task2.Classes.Guitar;
import HomeWork3.Task2.Classes.Trumpet;
import HomeWork3.Task2.Interfaces.Instrument;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Drum(4));
        instruments.add(new Guitar(6));
        instruments.add(new Trumpet(800));
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
