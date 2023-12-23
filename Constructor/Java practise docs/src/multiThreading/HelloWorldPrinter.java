package multiThreading;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World! Current thread name : " + Thread.currentThread().getName());
    }
}
