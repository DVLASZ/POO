package animals;

/**
 *
 * @author Edward Dávila Salazar
 */
public class Cat extends Animal{
    private String raza;

    public Cat(String name, String typeFood, int age, String raza) {
        super(name, typeFood, age);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getName() + "-"+getTypeFood()+"-"+getAge()+"-"+getRaza());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de ratones");
    }
}
