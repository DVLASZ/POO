package mainpackage;

import animals.Animal;
import animals.Dog;
import animals.Cat;
import animals.Horse;
import animals.Snake;
import animals.Condor;
        
/**
 *
 * @author Edward Dávila Salazar
 */
public class Main {
     public static void main(String[] args) {
    
        Animal Dog = new Dog("Stich","Carnivoro",15,"Doberman");
        Dog.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        Dog Dog1 = new Dog("Teddy","Croquetas",10,"Chihuahua");
        Dog1.Alimentarse();


        //-->Declaracion del objeto Gato
        Animal cat = new Cat("Pelusa","Galletas",15,"Siames");
        cat.Alimentarse();
        
        //-->Declaracion del objeto Caballo
        Animal horse = new Horse("Spark","Pasto",25,"Fino");
        horse.Alimentarse();
        
         //-->Declaracion del objeto Caballo
        Animal Snake = new Snake("Eve","Ratones",7,"Cobra");
        Snake.Alimentarse();
        
         //-->Declaracion del objeto Caballo
        Animal Condor = new Condor("Pepe","Carroña",4,"Andino");
        Condor.Alimentarse();
    }
}