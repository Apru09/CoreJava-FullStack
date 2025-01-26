public class StringExample {
    
    public static void main(String[] args) {
        
        // String can be created in two ways.

        // 1 : As a literal.

        String str1 = "This is a string";
        String str2 = "This is a string";

        // 2 : As an object.

        String str3 = new String("This is a string");


        // Refer the notes provided in the repository to know the difference.


        // CHECKS THE STRING REFERENCES.
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        

        // CHECKS THE STRING CONTENTS.
        System.out.println(str1.equals(str3));



    }
}
