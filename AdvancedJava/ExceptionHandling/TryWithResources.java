import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        int a;

        System.out.println("Try with resources");
        System.out.println();

        // Without having to write a finally block, a try block can use a resource and it gets
        // closed automatically when the try block execution is complete.
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            a = sc.nextInt();
            System.out.println(a);
        }
    }
        
}