class SpecialistVeterinarian extends GeneralVeterinarian {

    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    public SpecialistVeterinarian() {
    }

    @Override
    public String examinePet(Pet pet) {
        return "Special examination for " + pet.getName() + " in " + specialty +
                ".  Species: " + pet.getSpecies()
                + ",  Age: " + pet.getAge();
    }
}

