package HomeWork2.Task3;

public class Journal extends Book {
    private String periodic;
    private String format;

    //Constructor
    //NoArg
    public Journal() {
    }

    //AllArg
    public Journal(String title, int pages, String size, String periodic, String format) {
        super(title, pages, size);
        this.periodic = periodic;
        this.format = format;
    }

    //Getters & Setters
    //periodic
    public String getPeriodic() {
        return this.periodic;
    }

    public void setPeriodic(String periodic) {
        this.periodic = periodic;
    }

    //format
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "periodic='" + periodic + '\'' +
                ", format='" + format + '\'' +
                "} " + super.toString();
    }
}
