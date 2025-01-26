public class LogicalOperators {
    
    public static void main(String[] args) {


        /* 

            LOGICAL AND  (&&)

            A         B

            True      True   -> True.
            True      False  -> False.
            False     True   -> False.
            False     False  -> False.



            LOGICAL OR (||)


            A         B
            
            True      True   -> True.
            True      False  -> True.
            False     True   -> True.
            False     False  -> False.



            LOGICAL NOT (!)


            A

            True -> False.
            False -> True.

         */
        
        int num1 = 69;
        int num2 = 45;
        int num3 = 10;
        int num4 = 50;
        int num5 = 50;

        boolean result = (num1 > num2) && (num3 < num4);   // Gives True and True, so True.
        boolean result2 = (num1 < num2) && (num3 < num4);  // Gives False and True, so False (Vice versa).
        boolean result3 = (num1 < num2) || (num3 < num4);  // Gives False and True, so True.
        boolean result4 = num4 == num5;  // Gives True.
        boolean result5 = !(num4 == num5);  // Gives False.

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
