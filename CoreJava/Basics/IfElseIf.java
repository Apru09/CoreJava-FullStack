import java.util.Scanner;

public class IfElseIf {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   // Used to read inputs.

        int dayNumber;
        System.out.println("Enter the day: ");
        dayNumber = sc.nextInt();

        sc.close();      // Close scanner to avoid resource leak.

        System.out.println("Day Entered: " + dayNumber);

        if(dayNumber == 1) {
            System.out.println("Monday");
        }
        else if(dayNumber == 2) {
            System.out.println("Tuesday");
        }
        else if(dayNumber == 3) {
            System.out.println("Wednesday");
        }
        else if(dayNumber == 4) {
            System.out.println("Thursday");
        }
        else if(dayNumber == 5) {
            System.out.println("Friday");
        }
        else if(dayNumber == 6) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }
    }
}
