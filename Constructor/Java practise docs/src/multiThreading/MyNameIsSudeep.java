package multiThreading;

public class MyNameIsSudeep implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is Sudeep Chandra B S and I'm 28 already");
    }
}
