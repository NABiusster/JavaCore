package HomeWork5.Task3.Classes;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {
    private ArrayList<Car> cars;

    //Constructors
    //NoArg
    public Garage() {
    }
//AllArg
    public Garage(ArrayList<Car> cars) {
        this.cars = cars;
    }

    //Setters & Getters
    //cars
    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    //Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}