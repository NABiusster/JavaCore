package Lesson1;

public class Dog {
    private String name;
    private int age;
    private String poroda;

    public Dog() {
    }

    public Dog(int age, String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Lesson1.Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                '}';
    }
}
