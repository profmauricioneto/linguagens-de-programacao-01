
package basicjava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class ExampleTryCatch {
    public static void main(String[] args) {
        int den = 1;
        float res = 0;
        Scanner scan = new Scanner(System.in);
        try {
        System.out.print("Valor Denominador: ");
        den = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        
        try{
            res = (float)1/den;
            System.out.println(res);            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
            System.out.println("Executei");
        }
        
    }
}
