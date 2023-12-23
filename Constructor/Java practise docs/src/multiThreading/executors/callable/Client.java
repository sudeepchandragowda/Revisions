package multiThreading.executors.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10);

        ArrayAdder adder1 = new ArrayAdder(list1);
        ArrayAdder adder2 = new ArrayAdder(list2);

        //Thread t1 = new Thread(adder1); //thread does not accept callable
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Future<Integer> sum1 = executor.submit(adder1);
        Future<Integer> sum2 = executor.submit(adder2);

        //get the actual values from the futures

        int s1 = sum1.get();
        int s2 = sum2.get();

        System.out.println("Final result : " + (s1+s2));
    }
}
