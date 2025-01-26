public class DoWhileLoop {
    
    public static void main(String[] args) {
        
        int number = 0;

        do {
            System.out.println(number);
            number--;
        }
        while(number > 0);

        System.out.println("Do while loop executed.");

        // Do while executes the statement at least once before checking the condition.
        // Where as, normal while loop first checks condition and then executes the statement.

        while(number > 0) {
            System.out.println(number);
        }

        // Use do while loop, if you want to execute a particular statement at least once before checking condition.
    }
}
