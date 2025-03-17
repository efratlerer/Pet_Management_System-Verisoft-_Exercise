public class Dog extends Pet{

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    public Dog() {
    }

    @Override
    public String makeSound() {
        return "Dogs bark";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }
}
