package javageeksforgeeks.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {

    public static void main(String [] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<Integer>();
        Thread producer = new Producer(queue,"Producer",10);
        Thread consumer = new Consumer(queue,"Consumer",10);
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

class Producer extends Thread {
    private Queue<Integer> queue;
    private String name;
    private int maxSize;

    public Producer(Queue<Integer> queue,String name,Integer maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run(){
        while (true){
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    System.out.println("Producer waiting");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int num = random.nextInt();
                System.out.println("Producer putting " + num);
                queue.add(num);
                queue.notifyAll();

            }
        }

    }
}

class Consumer extends Thread {
    private Queue<Integer> queue;
    private String name;
    private int maxSize;

    public Consumer(Queue<Integer> queue,String name,Integer maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while(true){
            synchronized (queue) {
                while(queue.size()==0) {
                    System.out.println("Consumer waiting");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer taken out the element "+queue.remove());
                queue.notifyAll();
            }
        }

    }
}
