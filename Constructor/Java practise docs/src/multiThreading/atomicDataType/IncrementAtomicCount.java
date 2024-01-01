package multiThreading.atomicDataType;

public class IncrementAtomicCount implements Runnable{
    private AtomicCount atomicCount;
    public IncrementAtomicCount(AtomicCount atomicCount) {
        this.atomicCount = atomicCount;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++) {
            System.out.println("Thread name for atomic count : " + Thread.currentThread().getName());
            System.out.println("AtomicCount : " + atomicCount.atomicInteger.incrementAndGet());
        }
    }
}
