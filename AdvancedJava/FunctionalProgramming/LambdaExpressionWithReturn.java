interface Adder {

    int add(int i, int j);
}


public class LambdaExpressionWithReturn {
    
    public static void main(String[] args) {

        Adder adder = new Adder() {

            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };

        int result = adder.add(4,5);
        System.out.println(result);



        // Same thing using lambda expression can be done as follows..

        Adder adder2 = (i,j) -> i+j;
        int result2 = adder2.add(10,10);
        System.out.println(result2);
    }
}
