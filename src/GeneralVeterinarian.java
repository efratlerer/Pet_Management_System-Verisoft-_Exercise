public class GeneralVeterinarian implements Veterinarian{

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    public GeneralVeterinarian() {
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General examination for "+ pet.getName() +
                ".  Species: " + pet.getSpecies()
                + ",  Age: " + pet.getAge();

    }

}
