class Addition {

    public int add(int num1, int num2) {            // Add method which adds two numbers.
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {      // Add method which adds three numbers.
        return num1 + num2 + num3;
    }
}

/* Methods can have same names with different parameters. The behaviour of the method 
 * depends on the values passed to the parameters. This is Method Overloading.
 */

public class MethodOverloading {
    
    public static void main(String[] args) {

        Addition obj = new Addition();
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(4,5,6));

        
    }
}
