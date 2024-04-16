package Lesson1;

public class Car {
    private String model;
    private int power;
    private String volumeEngine;
    private boolean turbo;

    public Car() {
    }

    public Car(String model, int power, String volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(String volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Lesson1.Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine='" + volumeEngine + '\'' +
                ", turbo=" + turbo +
                '}';
    }
}
