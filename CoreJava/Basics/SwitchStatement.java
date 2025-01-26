import java.util.Scanner;

public class SwitchStatement {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String dayOfTheWeek;

        System.out.print("Enter the day: ");
        dayOfTheWeek = sc.nextLine();

        sc.close();

        switch(dayOfTheWeek) {

            case "Monday" :
                System.out.println("1st Day");
                break;
            
            case "Tuesday" :
                System.out.println("2nd Day");
                break;

            case "Wednesday" :
                System.out.println("3rd Day");
                break;

            case "Thursday" :
                System.out.println("4th Day");
                break;

            case "Friday" :
                System.out.println("5th Day");
                break;

            case "Saturday" :
                System.out.println("6th Day");
                break;

            case "Sunday" :
                System.out.println("7th Day");
                break;

            default :
                System.out.println("Enter valid day.");
        }
    }
}
