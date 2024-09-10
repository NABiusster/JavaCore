package HomeWork2.Task4;

public class Car {
    private String model;
    private int year;
    private  int power;
    //Constructors
    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public int getPower() {
        return this.power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }
}
