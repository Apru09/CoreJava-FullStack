enum Status {
    RUNNING,  // 0
    FAILED,   // 1
    PENDING,  // 2
    SUCCESS;  // 3
}

public class EnumSwitch {

    public static void main(String[] args) {

        Status status = Status.SUCCESS;

        switch(status) {

            case RUNNING :
                System.out.println("ALl good..");
                break;
            case PENDING :
                System.out.println("Please wait..");
                break;
            case FAILED :
                System.out.println("Try again..");
                break;
            case SUCCESS :
                System.out.println("Good to go..");
                break;
            default :
                System.out.println("Unknown status..");
        }
        
    }
}