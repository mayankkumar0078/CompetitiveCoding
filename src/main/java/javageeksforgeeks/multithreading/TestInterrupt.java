package javageeksforgeeks.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestInterrupt {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    Future<?> future = executor.submit(() -> {
      printNumbers(); // first call
     // printNumbers(); // second call
    });
    Thread.sleep(1000);
    executor.shutdownNow();  // will interrupt the task
    //executor.awaitTermination(1, TimeUnit.SECONDS);
  }

  private static void printNumbers() {
    long i=0;
    while (true){
      System.out.print(i++);
//      if(Thread.currentThread().isInterrupted()) {
//        break;
//      }
    }
  }
}
