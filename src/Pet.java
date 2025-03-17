
     // Abstract class named Pet - Every pet  will be a subclass of this
     public abstract class Pet {
        private String name;
        private int age;
        protected String species;

        // Constructor for the Pet class that accepts name, age, and species
        public Pet(String name, int age, String species) {
            this.name = name;
            this.age = age;
            this.species = species;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSpecies() {
            return species;
        }

        // Abstract method that forces subclasses to implement this method
        public abstract String makeSound();

        // Another abstract method for eating, which forces subclasses to implement it
        public abstract String eat();
    }
