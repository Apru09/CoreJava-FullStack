import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class StudentFile implements Serializable {

    private String name;
    private int age;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "StudentFile [name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", marks=" + marks + "]";
    }

    
}


public class ObjectSerialExample {
    
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            
            StudentFile s1 = new StudentFile();

            System.out.println("Enter student's name: ");
            s1.setName(sc.nextLine());

            System.out.println("Enter student's age: ");
            s1.setAge(sc.nextInt());

            System.out.println("Enter student's roll number: ");
            s1.setRollNo(sc.nextInt());

            System.out.println("Enter student's marks: ");
            s1.setMarks(sc.nextInt());

            oos.writeObject(s1);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
        finally {
            sc.close();
            oos.close();
        }
        
    }
}