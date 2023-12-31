
import java.util.Scanner;

public class Readers {

    //Puedo hacerlo más bonito con genericos, pero, no hay tiempo:D
    public static double readIntByARange(int min, int max, String label) {
        int rtn;
        while (true) {
            rtn = readInt(label) - 1;
            if (rtn > min && rtn < max) {
                return rtn;
            }
            System.out.println("Mantente en los limites! min" + min + " maximo: " + max);
        }
    }

    public static double readDouble(String label) {
        Scanner scan = new Scanner(System.in);
        double rtn = 0; //Va a almacenar el valor del usuario si es double

        try {
            System.out.println(label);
            rtn = scan.nextDouble();
            return rtn;
        } catch (Exception ex) {
            System.out.println("Solo escribe numeros! " + ex.getMessage());
        }
        return 0;

    }

    public static int readInt(String label) {
        Scanner scan = new Scanner(System.in);
        int rtn; //Va a almacenar el valor del usuario si es double

        try {
            System.out.println(label);
            rtn = scan.nextInt();
            return rtn;
        } catch (Exception ex) {
            System.out.println("Solo escribe numeros enteros! " + ex.getMessage());

        }
        return 0;

    }

    public static String readString(String label) {
        //Como un String puede almacenar tanto numeros, como simbolos no es necesario el try catch
        System.out.println(label);
        return new Scanner(System.in).nextLine();
    }
}
