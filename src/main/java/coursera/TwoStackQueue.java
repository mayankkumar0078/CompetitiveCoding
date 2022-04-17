package coursera;

import java.util.Queue;

/**
 * Question 1
 * Queue with two stacks. Implement a queue with two stacks
 * so that each queue operations takes a constant amortized number of stack operations.
 */
public class TwoStackQueue {

    public static class Stack<T> {
        T arr[];
        int top = -1;

        public Stack() {
            arr = (T[]) new Object[10];
        }

        public void push(T item) {
            if (top == arr.length - 1) {
                System.out.println("increasing the size of stack to " + arr.length * 2);
                T arrCopy[] = arr;
                arr = (T[]) new Object[(arr.length * 2)+1];
                for (int i = 0; i < arrCopy.length; i++) {
                    arr[i] = arrCopy[i];
                }
            }
            arr[++top] = item;
        }

        public T pop() {
            if(top == -1) {
                System.out.println("Stack Underflow");
                return null;
            }
            T item = arr[top];
            arr[top] = null;
            top--;
            if (top < arr.length / 2) {
                System.out.println("Decreasing the size to " + arr.length / 2);
                T arrCopy[] = arr;
                arr = (T[]) new Object[(arr.length / 2)+1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arrCopy[i];
                }
            }
            return item;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static class Queue<T> {
        private Stack<T> stack1;
        private Stack<T> stack2;

        public Queue(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enQueue(T item) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(item);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public T deQueue() {
            if(stack1.isEmpty()) {
                System.out.println("No item in queue");
                return null;
            }
            return stack1.pop();
        }

        public boolean isEmpty() {
            return stack1.isEmpty();
        }
    }

    public static void main(String []args) {
        Queue<Integer> queue = new Queue<Integer>();
        for (int i=0;i<5;i++) {
            queue.enQueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.deQueue());
        }

    }
}
