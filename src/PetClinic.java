import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {
        // Creating a list of pets
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 3, "Labrador"));
        pets.add(new Cat("Whiskers", 2 , "White"));
       // Creating a list of veterinarians
        List<Veterinarian> vets = new ArrayList<>();
        vets.add(new GeneralVeterinarian("Dr. Smith"));
        vets.add(new SpecialistVeterinarian("Dr. Adams", "Dermatology"));
       // For each pet, print its details and have veterinarians examine it
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " the " + pet.species + " says: " + pet.makeSound());
            System.out.println(pet.getName() + " eats: " + pet.eat());
            
            for (Veterinarian vet : vets) {
                System.out.println(vet.getName() + " examines " + pet.getName() + ": " + vet.examinePet(pet));
            }
            System.out.println("----------------------");
        }
    }
}


