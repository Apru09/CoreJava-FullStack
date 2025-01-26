public class StringMethods {
    
    public static void main(String[] args) {

        // Some useful methods for string manipulation. Refer notes for better clarification.

        String str = "Apple Macbook Air";
        String str2 = "Apple Macbook Air";
        String str3 = "Air";

        String str4 = " This is a line. ";

        System.out.println("Length of the String: " + str.length());  // Prints - Length of the String: 17

        System.out.println("Character at ith index: " + str.charAt(3)); // Prints - Character at ith index: l

        System.out.println("Substring of str: " + str.substring(4));  // Prints - Substring of str: e Macbook Air

        System.out.println("Substring of str: " + str.substring(6, 13));  // Prints - Substring of str: Macbook

        System.out.println("Concatenation of str: " + str.concat(" M3"));  // Prints - Concatenation of str: Apple Macbook Air M3

        System.out.println("String equals: " + str.equals(str2));  // Prints - String equals: true

        System.out.println("Changing str to uppercase: " + str.toUpperCase());  // Prints - Changing str to uppercase: APPLE MACBOOK AIR

        System.out.println("Changing str to lowercase: " + str.toLowerCase());  // Prints - Changing str to lowercase: apple macbook air

        System.out.println("Finding index of specified str: " + str.indexOf(str3));  // Prints - Finding index of specified str: 14

        System.out.println("Removing whitespaces in str4: " + str4.trim());  // Prints - Removing whitespaces in str4: This is a line.

        System.out.println("Replacing characters in the string: " + str.replace('A', 'B'));  // Prints - Replacing characters in the string: Bpple Macbook Bir


        System.out.print("Convert string to character array: ");

        char ch[] = str.toCharArray();

        for(char item : ch) {
            System.out.print(item + " ");
        }

        // Prints - Convert string to character array: A p p l e   M a c b o o k   A i r
        
    }
}
