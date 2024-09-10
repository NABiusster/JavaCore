package HomeWork2.Task2;

public class UltraBook extends Laptop {
    private double weight;
    private double thickness;

    //Constructors
    //NoArg
    public UltraBook() {}
    //AllArg
    public UltraBook(String CPU, String GPU, String RAM, String HDD, String brand, String model, double weight, double thickness) {
        super(CPU, GPU, RAM, HDD, brand, model);
        this.weight = weight;
        this.thickness = thickness;
    }
    //Getters & Setters
    //Weight
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //thickness
    public double getThickness() {
        return this.thickness;
    }
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "weight=" + weight +
                ", thickness=" + thickness +
                super.toString();
    }
}
