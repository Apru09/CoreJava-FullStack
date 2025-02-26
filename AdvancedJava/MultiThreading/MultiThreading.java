class A extends Thread {

    public void run() {
        for(int i=0; i<50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/* THREAD SLEEP
 * Here, I am trying to make two threads run almost parallely by using Thread.sleep() method.
 * This method makes the thread to wait for certain amount of time (which we mention) and again 
 * executes.
 */

class B extends Thread {

    public void run() {
        for(int i=0; i<50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MultiThreading {
    
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();


        obj2.setPriority(10);

        /*
         * When start method is called, internally run() method is invoked. So, your class
         * (thread) needs to have run method in it.
         */
        obj1.start();
        obj2.start();
        
    }
}


/* MULTI THREADING
 * Without multithreading concept, which means without extending Thread class,
 * when obj1.run() and obj2.run() are called, The methods are invoked sequentially.
 * Where class A's run() being called 50 times first and then the class B's run().
 * 
 * When Thread class is extended, we basically make two threads to make them work in parallel.
 * Then, you don't call the run() method, instead you call start() method which internally
 * invokes run().
 */



/* THREAD PRIORITY
 * Every thread has a default(normal) priority which is 5. 
 * The least priority is 1 and highest is 10. We can set the priority of the thread by using
 * setPriority() method.
 * 
 * Even then, it depends on the thread scheduler and it's algorithm for which thread it runs first.
 * As a developer, one can optimise to make it accurate and efficient.
 */
