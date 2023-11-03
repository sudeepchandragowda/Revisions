package multiThreading;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
        MyNameIsSudeep sudeep = new MyNameIsSudeep();
        Thread t1 = new Thread(sudeep);
        t1.start();
        Thread.sleep(3000); // asking the main thread to pause execution for 3 secs
        System.out.println("Hello World from main method");
    }
}

// Java starts -> main thread
// main thread -> create a thread and print Hello World
// main thread -> print Hello World
