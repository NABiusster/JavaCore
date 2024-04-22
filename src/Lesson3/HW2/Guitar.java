package Lesson3.HW2;

import lombok.Data;

@Data
public class Guitar implements Instrument{
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Грає гітара з "+numberOfStrings+" струнами");
    }

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
