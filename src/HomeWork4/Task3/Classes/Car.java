package HomeWork4.Task3.Classes;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private int power;

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

    //Methods
    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && power == car.power && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, power);
    }
}
