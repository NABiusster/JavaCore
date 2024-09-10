package HomeWork2.Task2;

public class Laptop extends PC {
    private String brand;
    private String model;

    //Constructors
    //noArg
    public Laptop() {
    }

    //AllArg
    public Laptop(String CPU, String GPU, String RAM, String HDD, String brand, String model) {
        super(CPU, GPU, RAM, HDD);
        this.brand = brand;
        this.model = model;
    }


    //Getters & Setters
    //Brand
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Model
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                super.toString();
    }
}
