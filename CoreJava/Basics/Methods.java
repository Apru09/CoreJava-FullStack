public class Methods {
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Methods (Called functions in C and C++) in java are to reuse the code without rewriting it 
    // everytime we need it.
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        System.out.println(add(number1, number2));

        // Hereafter, if we need to add two numbers, we can call add method and pass the values
        // as parameters.
        
    }
}
