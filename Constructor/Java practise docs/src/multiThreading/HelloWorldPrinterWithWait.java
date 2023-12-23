package multiThreading;

public class HelloWorldPrinterWithWait implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World from HelloWorldPrinterWithWait! Current thread name : "+ Thread.currentThread().getName());
    }
}
