package multiThreading;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
        //Thread.sleep(3000); // asking the main thread to pause execution for 3 secs
        System.out.println("Main method line thread : " + Thread.currentThread().getName());
        System.out.println("Hello World from main method");
        Adder adder = new Adder(10, 11);
        Thread t1 = new Thread(adder);
        t1.start();
        for (int i=0; i<50; i++) {
            SquarePrinter squarePrinter = new SquarePrinter(i);
            Thread sqThread = new Thread(squarePrinter);
            sqThread.start();
        }
        //create 50n threads and for each thread print the square of the number between 1-50
    }
}
// Java starts -> main thread
// main thread -> create a thread and print Hello World
// main thread -> print Hello World
