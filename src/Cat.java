public class Cat extends Pet {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, "Cat");
        this.color = color;
    }

    public Cat() {
    }

    @Override
    public String makeSound() {
        return "Cats meow";
    }

    @Override
    public String eat() {
        return "Cats eat cat food";
    }
}
