package HomeWork2.Task1;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    //Constructors
    //allArg
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    //noArg
    public Company() {
    }

    //Getters and Setters
    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //catchPhrase
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getCatchPhrase() {
        return this.catchPhrase;
    }

    //bs
    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getBs() {
        return this.bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
