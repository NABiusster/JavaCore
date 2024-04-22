package Lesson3.HW2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(6));
        instruments.add(new Drum(400));
        instruments.add(new Trumpet(250));
        for (Instrument instrument : instruments) {
            instrument.play();

        }
    }
}
