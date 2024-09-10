package HomeWork2.Task2;

public class Netbook extends  Laptop{
    private int size;
    //Constructors
    //NoArg
    public Netbook(){}
    //AllArg
    public Netbook(String CPU, String GPU, String RAM, String HDD,String brand, String model,int size){
        super(CPU, GPU, RAM, HDD, brand, model);
        this.size = size;
    }
    //Getters & Setters
    //Size
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Netbook{" +
                "size=" + size +
                super.toString();
    }
}
