package pkg060923;

import exercise.Persona;

public class Main {

    public static void main(String[] args) {

        Persona[] arrayPerson = new Persona[3];
        //Persona person = new Persona("Edward", "Dávila", "1094238109");
        //Persona person2 = new Persona("Jonh", "Navia", "1092028299");
        arrayPerson[0] = new Persona("Edward", "Davila", "1091090909");
        arrayPerson[1] = new Persona("Jonh", "Navia", "09124809789");
        arrayPerson[2] = new Persona("Alejandro", "Suarez", "21798173921");

        System.out.println(arrayPerson[0].getFirstName());
        System.out.println(arrayPerson[0].getLastName());
        System.out.println(arrayPerson[0].getDocument());

        arrayPerson[0].setFirstName("Esteban");
        arrayPerson[0].setLastName("Salazar");
        
    for (Persona persona : arrayPerson){
        System.out.println("-----------------\n" + persona.getFirstName());
        System.out.println(persona.getLastName());
        System.out.println(persona.getDocument());
        }
    }
}