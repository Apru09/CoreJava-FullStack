import java.util.Scanner;


public class Arrays {
    
    public static void main(String[] args) {
        
        // Arrays are used to store data in a contiguous order.

        int[] ar = {1,2,3,4,5};  // Hardcoded. 

        System.out.print("Array values are: ");

        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();
        System.out.println();


        int[] ar2 = new int[5];    // Size and values hardcoded.
        ar2[0] = 10;
        ar2[1] = 20;
        ar2[2] = 30;
        ar2[3] = 40;
        ar2[4] = 50;

        System.out.print("Array 2 values are: ");
        for(int i=0; i<ar2.length; i++) {
            System.out.print(ar2[i] + " ");
        }

        System.out.println();
        System.out.println();


        // Reading array inputs from the user.

        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        // Array creation using the size entered by the user.
        int[] ar3 = new int[size];

        System.out.println("Enter the elements into the array: ");
        for(int i=0; i<ar3.length; i++) {
            ar3[i] = sc.nextInt();           // taking inputs from user at runtime.
        }

        sc.close();

        System.out.print("Array 3 values are: ");

        for(int i=0; i<ar3.length; i++) {
            System.out.print(ar3[i] + " ");
        }

    }
}
