import java.util.Scanner;


// This program demonstrates usage of throw and throws keywords and also creating a
// Custom Exception.

public class ThrowAndThrows {
    
    public static void main(String[] args) throws NegativeNumberException {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter 1st number: ");
        a = sc.nextInt();

        try {
            if(a < 0) {
                throw new NegativeNumberException();
            }
            if(a % 2 == 0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        
        catch(NegativeNumberException ex) {
            System.out.println("Enter postive numbers");
        }

        finally {
            sc.close();
        }
    }
}
