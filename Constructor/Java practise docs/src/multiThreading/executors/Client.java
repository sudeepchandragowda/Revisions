package multiThreading.executors;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //task class object
        //create the threads using the task class
        //start the thread

        /* now we will do this */
//        ExecutorService executor = Executors.newScheduledThreadPool(10); // executor service with the threadpool
//        for (int i=1; i<=50; i++) {
//            if(i == 5 || i == 11 || i==20){
//                System.out.println("Debug");
//            }
//        CubePrinter cubePrinter = new CubePrinter(i); //creating a task
//        executor.execute(cubePrinter); // giving the task to executor, and asking it to do it
//        }
//        System.out.println("Debug");
//        executor.shutdown();

        List<Integer> list = List.of(13,5,1,4,32,7,3,2,11);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        Future<List<Integer>> futureSortedList = executorService.submit(mergeSorter);
        List<Integer> sortedList = futureSortedList.get();
        System.out.println("SortedList : " + sortedList);
    }
}
