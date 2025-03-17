// Class named SpecialistVeterinarian that implements Veterinarian and extends GeneralVeterinarian
public class SpecialistVeterinarian extends GeneralVeterinarian {

    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);// Calls the GeneralVeterinarian constructor
        this.specialty = specialty;
    }
    //Overriding the function examinePet in GeneralVeterinarian
    @Override
    public String examinePet(Pet pet) {
        return "Special examination for " + pet.getName() + " in " + specialty +
                ".  Species: " + pet.getSpecies()
                + ",  Age: " + pet.getAge();
    }
}

