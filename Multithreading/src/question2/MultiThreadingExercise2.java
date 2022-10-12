package question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
	public class MultiThreadingExercise2 {
	    public static void main(String[] args) {
	        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
	        for (int i = 0; i < 10 ; i++) {
	            int finalI = i;
	            executorService1.submit(() -> {
	                System.out.println("Fixed Thread pool "+ finalI);
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            });
	        }
	        executorService1.shutdown();
	        try {
	            executorService1.awaitTermination(5, TimeUnit.MINUTES);
	            System.out.println("Fixed Thread pool finished execution");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
	        for (int i = 0; i < 10 ; i++) {
	            int finalI = i;
	            executorService2.submit(() -> {
	                System.out.println("Single Thread Executor "+ finalI);
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            });
	        }
	        executorService2.shutdown();
	        try {
	            executorService2.awaitTermination(5, TimeUnit.MINUTES);
	            System.out.println("Single Thread Executor finished Execution");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        ExecutorService executorService3 = Executors.newCachedThreadPool();
	        for (int i = 0; i < 10 ; i++) {
	            int finalI = i;
	            executorService3.submit(() -> {
	                System.out.println("Cached thread pool "+ finalI);
	                try {
	                    Thread.sleep(500);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            });
	        }
	        executorService3.shutdown();
	        try {
	            executorService3.awaitTermination(5, TimeUnit.MINUTES);
	            System.out.println("Cached thread pool finished Execution");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}
	//----------------------------OUTPUT------------------------
//  Fixed Thread pool 0
//  Fixed Thread pool 2
//  Fixed Thread pool 3
//  Fixed Thread pool 1
//  Fixed Thread pool 4
//  Fixed Thread pool 5
//  Fixed Thread pool 9
//  Fixed Thread pool 6
//  Fixed Thread pool 7
//  Fixed Thread pool 8
//  Fixed Thread pool finished execution
//  Single Thread Executor 0
//  Single Thread Executor 1
//  Single Thread Executor 2
//  Single Thread Executor 3
//  Single Thread Executor 4
//  Single Thread Executor 5
//  Single Thread Executor 6
//  Single Thread Executor 7
//  Single Thread Executor 8
//  Single Thread Executor 9
//  Single Thread Executor finished Execution
//  Cached thread pool 0
//  Cached thread pool 1
//  Cached thread pool 2
//  Cached thread pool 3
//  Cached thread pool 4
//  Cached thread pool 5
//  Cached thread pool 6
//  Cached thread pool 7
//  Cached thread pool 8
//  Cached thread pool 9
//  Cached thread pool finished Execution
