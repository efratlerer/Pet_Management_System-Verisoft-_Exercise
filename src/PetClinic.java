import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 3, "Labrador"));
        pets.add(new Cat("Whiskers", 2 , "White"));

        List<Veterinarian> vets = new ArrayList<>();
        vets.add(new GeneralVeterinarian("Dr. Smith"));
        vets.add(new SpecialistVeterinarian("Dr. Adams", "Dermatology"));

        for (Pet pet : pets) {
            System.out.println(pet.getName() + " the " + pet.getSpecies() + " says: " + pet.makeSound());
            System.out.println(pet.getName() + " eats: " + pet.eat());
            
            for (Veterinarian vet : vets) {
                System.out.println(vet.getName() + " examines " + pet.getName() + ": " + vet.examinePet(pet));
            }
            System.out.println("----------------------");
        }
    }
}


