// Class named GeneralVeterinarian that implements Veterinarian
public class GeneralVeterinarian implements Veterinarian{

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }
    //Implementation of the getName method in Veterinarian
    @Override
    public String getName(){
        return name;
    }

    //Implementation of the examinePet method in Veterinarian
    @Override
    public String examinePet(Pet pet) {
        return "General examination for "+ pet.getName() +
                ".  Species: " + pet.getSpecies()
                + ",  Age: " + pet.getAge();

    }

}
