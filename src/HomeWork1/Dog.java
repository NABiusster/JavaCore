package HomeWork1;

public class Dog {
    // name
    // age
    // poroda

    private String name;
    private int age;
    private String breed;

    // Constructors
    // noArg
    public Dog() {
    }

    ;

    //allArg
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Getters and Setters
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //toString

    @Override
    public String toString() {
        return "\nName: " + name + ", Age: " + age + ", Breed: " + breed;
    }
}
