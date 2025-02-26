import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int result = 0;

        try {

            System.out.println("Enter 1st number: ");
            a = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            b = sc.nextInt();

            result = a/b;
            System.out.println("Quotient of the numbers : " + result);
        }

        catch(ArithmeticException ex1) {   // Caught here when b input is 0.
            System.out.println("What went wrong-> " + ex1);
        }

        catch(InputMismatchException ex2) {  // Caught here when any of a or b are invalid inputs.
            System.out.println("What went wrong-> " + ex2);
        }

        finally {     // This block gets executed for sure.
            sc.close();
            System.out.println("Execution complete..");
        }   
    }
}