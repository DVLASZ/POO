package animals;

/**
 *
 * @author Edward Dávila Salazar
 */
public abstract class Animal {
    private String name,typeFood;
    private int age;

    public Animal(String name,String typeFood,int age){
        this.name = name;
        this.typeFood = typeFood;
        this.age = age;
    }

    /**
     * @Tittle METODO ABSTRACTO
     * @Content Este metodo se crea cuando declaramos abstract la funcion
     */
    public abstract void Alimentarse();

    public void Moverse(){
        System.out.println("El animal se esta moviendo");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
