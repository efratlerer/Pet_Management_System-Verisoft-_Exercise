// Class named Dog that implements Pet - Dog
public class Dog extends Pet {
    private String breed;  // Dog breed

    // Constructor for Dog that accepts name, age, and breed
    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");  // Calls the Pet constructor with "Dog" as species
        this.breed = breed;
    }

    // Implementation of the makeSound method in Pet
    @Override
    public String makeSound() {
        return "Bark";
    }

    // Implementation of the eat method in Pet
    @Override
    public String eat() {
        return "Eat dog food";
    }
}