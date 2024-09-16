package HomeWork4.Task4.Classes;

import java.util.Objects;

public class Pet {
    private String name;
    private int id;
    private String animal;

    //Constructors
    //AllArg
    public Pet(String name, int id, String animal) {
        this.name = name;
        this.id = id;
        this.animal = animal;
    }

    //noArg
    public Pet() {
    }

    //Getters & Setters
    //Name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Animal
    public String getAnimal() {
        return this.animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    //Methods
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", animal='" + animal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id && Objects.equals(name, pet.name) && Objects.equals(animal, pet.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, animal);
    }
}
