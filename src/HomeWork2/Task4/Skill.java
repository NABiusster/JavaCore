package HomeWork2.Task4;

public class Skill {
    private  String title;
    private int exp;

    //Constructors
    //AllArg
    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }
    //NoArg
    public Skill (){}


    //Getters & Setters
    //exp
    public int getExp() {
        return this.exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    //title
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}
