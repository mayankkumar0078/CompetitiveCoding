package javageeksforgeeks.multithreading;

import java.util.Scanner;

public class ThreadNumber {
    public static void main(String[] args) throws InterruptedException {
        Scanner in =new Scanner(System.in);
        int numThreads = in.nextInt();

        Object lock = new Object();
        Thread threads[]= new Thread[numThreads+1];
        Integer currentNum = new Integer(1);
        for(int i=1;i<=numThreads;i++){
            threads[i] = new ThreadNum("Thread"+i,i,currentNum,numThreads,lock);
        }

        for(int i=numThreads;i>=1;i--){
            threads[i].start();
        }
        while(true){
            Thread.sleep(5000);
            synchronized (lock){
                lock.notifyAll();
            }

        }



    }
}

class ThreadNum extends Thread {
    private Object lock;
    private Integer myNum;
    private Integer currentNum;
    private Integer totalThreads;
    private String name;

    public ThreadNum( String name, Integer myNum, Integer currentNum, Integer totalThreads,Object lock) {

        this.myNum = myNum;
        this.currentNum = currentNum;
        this.totalThreads = totalThreads;
        this.name = name;
        this.lock = lock;
    }

    public void run() {
        while(true) {
            synchronized (lock){
                while (currentNum%totalThreads!=myNum) {
                    System.out.println( name +" is waiting " +currentNum);
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(name +"  "+currentNum++);
                lock.notifyAll();
            }
        }
    }
}
