package multiThreading.synchronization;

public class SynchronizedBlockCount {
    int value = 0;
    public void increment() {
        synchronized (this) {
            value++;
        }
    }
    public int getValue() {
        return value;
    }
}
