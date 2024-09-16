package HomeWork4.Task4.Classes;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club;

    //Constructors
    //NoArg
    public ZooClub() {
    }

    //AllArg
    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    //Methods
    private Map.Entry<Person, List<Pet>> getPersonById(int id) {
        return this.club.entrySet().stream().filter(item -> item.getKey().getId() == id).findFirst().orElse(null);
    }

    public void addPerson(String name, int id) {
        this.club.put(new Person(name, id), new ArrayList<Pet>());
    }

    public void deletePerson(int id) {
        this.club.remove(getPersonById(id).getKey());
    }

    public void addPet(int id, Pet pet) {
        this.club.get(getPersonById(id).getKey()).add(pet);
    }

    public void deletePet(int id) {
        this.club.remove(getPersonById(id).getKey());
    }
}
