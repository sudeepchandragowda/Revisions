package multiThreading.atomicDataType;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Count count = new Count(0);
        AtomicCount atomicCount = new AtomicCount(atomicInteger);

        IncrementerCount incrementerCount = new IncrementerCount(count);
        IncrementAtomicCount incrementAtomicCount = new IncrementAtomicCount(atomicCount);

        Thread t1 = new Thread(incrementerCount);
        Thread t2 = new Thread(incrementerCount);

        Thread t3 = new Thread(incrementAtomicCount);
        Thread t4 = new Thread(incrementAtomicCount);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
