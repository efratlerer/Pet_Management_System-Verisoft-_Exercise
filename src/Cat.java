// Class named Cat that implements Pet - Cat
public class Cat extends Pet {
    private String color;  // Cat's color

    // Constructor for Cat that accepts name, age, and color
    public Cat(String name, int age, String color) {
        super(name, age, "Cat");  // Calls the Pet constructor with "Cat" as species
        this.color = color;
    }

    // Implementation of the makeSound method in Pet
    @Override
    public String makeSound() {
        return "Meow";
    }

    // Implementation of the eat method in Pet
    @Override
    public String eat() {
        return "Eat cat food";
    }
}