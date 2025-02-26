import java.util.Scanner;

public class TryWithFinally {
    
    public static void main(String[] args) {
        

        System.out.println("Try with Finally");
        System.out.println();
        
        
        String string;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            string = scanner.nextLine();
            System.out.println(string);
        }
        // Finally block main purpose is to execute the statements like closing resources.
        finally {
            scanner.close();
        }

        System.out.println();
    }
}
