class Counter {

    int count;
    public synchronized void increment() {
        count++;
    }
}


class A implements Runnable {

    Counter c;

    public A(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i=0; i<1000; i++) {
            c.increment();
        }
    }
}

class B implements Runnable {

    Counter c;

    public B(Counter c) {
        this.c = c;
    }

    public void run() {
        for(int i=0; i<1000; i++) {
            c.increment();
        }
    }
}



public class Synchronized {
    
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        A obj1 = new A(c);
        B obj2 = new B(c);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // join() method makes the main method wait before the threads complete, then prints the count.
        t1.join();
        t2.join();

        System.out.println(c.count);
        
    }
}
