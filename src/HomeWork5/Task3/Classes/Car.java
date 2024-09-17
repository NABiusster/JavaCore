package HomeWork5.Task3.Classes;

import HomeWork5.Task3.Enum.Brand;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private Brand brand;
    private int enginePower;
    private Person owner;
    private double price;
    private int year;

    //Constructors
    //noArg
    public Car() {
    }

    //AllArg
    public Car(Brand brand, int enginePower, Person owner, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    //Getters & Setters
    //brand
    public Brand getBrand() {
        return this.brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    //EnginePower
    public int getEnginePower() {
        return this.enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    //Owner
    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    //Price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Methods

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", enginePower=" + enginePower +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return enginePower == car.enginePower && year == car.year && brand == car.brand && Objects.equals(owner, car.owner) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, enginePower, owner, price, year);
    }
}