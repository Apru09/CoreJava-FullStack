import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

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


public class ObjectDeserialExample {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentFile student = (StudentFile) ois.readObject();

        System.out.println(student);

        ois.close();
        
    }
}
