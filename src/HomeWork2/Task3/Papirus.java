package HomeWork2.Task3;

public class Papirus {
    private String size;

    //Constructors
    //AllArg
    public Papirus(String size) {
        this.size = size;
    }

    //NoArg
    public Papirus() {
    }

    //Getters & Setters
    //Size
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "size=" + size +
                '}';
    }
}
