package HomeWork4.Task3.Classes;

import java.util.Objects;

public class Skill {
    private String title;
    private int exp;

    //Constructors
    //AllArg
    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    //NoArg
    public Skill() {
    }


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

    //Methods
    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return exp == skill.exp && Objects.equals(title, skill.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, exp);
    }
}
