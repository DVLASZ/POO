package exercise_class;
import call.unicauca.edu.co.ex_atrr;

public class exercise_class {

    public static void main(String[] args) {
        
        ex_atrr atrr = new ex_atrr();
        
        System.out.println("Access var: ");
        System.out.println("Import name I1: " + atrr.name);
        
        atrr.name = "Esteban";
        
        System.out.println("Import name I2: " + atrr.name);
        
        System.out.println("Import year: " + atrr.year_hdb);
    }
    
}
