
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    

    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")";
    }

}
