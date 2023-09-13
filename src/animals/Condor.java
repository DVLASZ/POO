package animals;

/**
 *
 * @author Edward Dávila Salazar
 */
public class Condor extends Animal {
    private String species;

    public Condor(String name, String typeFood, int age, String species) {
        super(name, typeFood, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void mostrar(){
        System.out.println(getName() + "-"+getTypeFood()+"-"+getAge()+"-"+getSpecies());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de carroña");
    }
}
