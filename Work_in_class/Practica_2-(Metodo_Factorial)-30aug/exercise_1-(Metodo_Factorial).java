//Edward Esteban Dávila Salazar

package Exercise;

public class exercise_1 {

    public static void main(String[] args) {
        exercise_1 ex = new exercise_1();
        System.out.println(ex.factorial(5));
    }
    
    public int factorial_r (int n) {
        if (n == 0 || n == 1){
            return 1;
        }else{
            return factorial_r (n -1)*n;
        }
    }
    
    public int factorial (int n) {
        int aux =1;
        for(int a = 1; a <= n; a++){
            aux = aux * a;
            
        }
        return aux;
    }
    
}
    

