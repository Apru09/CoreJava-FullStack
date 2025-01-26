public class RelationalOperators {
    
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 25;
        int num3 = 10;

        boolean greaterThan = num1 > num3;
        boolean greaterThanOrEquals = num1 >= num2;
        boolean lesserThan = num1 < num3;
        boolean equalsTo = num1 == num2;
        boolean notEqualsTo = num1 != num3;

        System.out.println("25 is greater than 10: " + greaterThan);
        System.out.println("25 is greater than or equals to 25: " + greaterThanOrEquals);
        System.out.println("25 is lesser than 10: " + lesserThan);
        System.out.println("25 is equals to 25: " + equalsTo);
        System.out.println("25 is not equals to 10: " + notEqualsTo);
        
    }
}
