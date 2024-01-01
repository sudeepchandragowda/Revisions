package multiThreading.synchronization;

public class SynchronizedMethodCount {
    int value = 0;
    public synchronized void increment() {
        value++;
    }
    public int getValue() {
        return value;
    }
}
