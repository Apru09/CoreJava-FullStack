import java.util.Scanner;
public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        
        int[][] array = new int[3][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values into the array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt(); 
            }
        }

        sc.close();

        for(int[] i : array) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
