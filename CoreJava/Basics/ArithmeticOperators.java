public class ArithmeticOperators {
   
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;

        int additionOfNumbers = num1 + num2;
        int substractionOfNumbers = num1 - num2;
        int multiplicationOfNumbers = num1 * num2;
        int divisionOfNumbers = num1 / num2;
        int remainderFromDivision = num1 % num2;

        System.out.println("Addition: " + additionOfNumbers);
        System.out.println("Substraction: " + substractionOfNumbers);
        System.out.println("Multiplication: " + multiplicationOfNumbers);
        System.out.println("Division (Quotient): " + divisionOfNumbers);
        System.out.println("Division (Remainder): " + remainderFromDivision);
    }
}
