enum Status {
    RUNNING,  // 0
    FAILED,   // 1
    PENDING,  // 2
    SUCCESS;  // 3
}

public class EnumExample {

    public static void main(String[] args) {

        Status status = Status.SUCCESS;
        System.out.println(status);
        System.out.println(status.ordinal());  // Prints the position of this particular object.

        // To get all objects from the enum Status at once.

        Status[] everyStatus = Status.values();

        for(Status item : everyStatus) {
            System.out.println(item + " : " + item.ordinal());
        }
        
    }
}