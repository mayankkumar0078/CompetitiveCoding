package javageeksforgeeks.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        Worker worker1 = new Worker(countDownLatch,2000);
        Worker worker2 = new Worker(countDownLatch,2000);
        Worker worker3 = new Worker(countDownLatch,2000);
        Worker worker4 = new Worker(countDownLatch,2000);
        Worker worker5 = new Worker(countDownLatch,2000);

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finished");
    }
}

class Worker extends Thread{
    private CountDownLatch countDownLatch;
    private int delay;

    public Worker(CountDownLatch countDownLatch,int delay) {
        this.countDownLatch = countDownLatch;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName()+"   "+countDownLatch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
