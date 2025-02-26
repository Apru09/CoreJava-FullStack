import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) throws IOException{

        // Developers used to take inputs from users with the help of BufferedReader 
        // before Java 1.5
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter a number for BufferedReader: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);



        // A special utility class called "Scanner" has been introduced in Java 1.5
        // This class provides many methods and it's main usage is to take inputs from the user.


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter another number for Scanner: ");
        int b = sc.nextInt();
        System.out.println(b);

        sc.close();

        // Always close the scanner object after usage to avoid resource leak.
    }
}
