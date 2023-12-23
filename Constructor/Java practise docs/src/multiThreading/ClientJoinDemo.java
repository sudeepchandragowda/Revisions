package multiThreading;

public class ClientJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();
        t.join();
        HelloWorldPrinterWithWait hwpww = new HelloWorldPrinterWithWait();
        Thread t2 = new Thread(hwpww);
        t2.start();
        System.out.println("Hello World from main thread");
    }
}
