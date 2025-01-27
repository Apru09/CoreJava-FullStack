class Student {

    private String name;              // Always make your instance variables private.
    private int rollNo;
    private int score;

    // Getters and setters (public methods) are used to access the instance variables.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", score=" + score + "]";
    } 
}

public class Encapsulation {
    
    public static void main(String[] args) {

        Student s1 = new Student();

        // Calling public methods to set values for the objects.
        
        s1.setName("Dhoni");
        s1.setRollNo(7);
        s1.setScore(79);

        Student s2 = new Student();
        s2.setName("Virat");
        s2.setRollNo(18);
        s2.setScore(69);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        
    }
}
