package HomeWork1;

public class Car {
    // model
    // power
    // volumeEngine
    // turbo
    private String model;
    private int power;
    private String volumeEngine;
    private Boolean turbo;

    // Getters and Setters
    //Model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    //Power
    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    //volumeEngine
    public void setVolumeEngine(String volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
    public String getVolumeEngine() {
        return volumeEngine;
    }

    //turbo
    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }
    public Boolean getTurbo() {
        return turbo;
    }

    // Constructors
    // noArg
    public Car() {};

    // allArg
    public Car(String model, int power, String volumeEngine, Boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }
    public String toString() {
        return "\nModel = "+this.model+"\nPower = "+this.power+"\nVolumeEngine = "+this.volumeEngine+"\nTurbo = "+this.turbo+"\n";
    }
}