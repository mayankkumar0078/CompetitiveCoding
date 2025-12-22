package interview.linkedin;

public class MaxStack<T extends Comparable> implements IMaxStack<T>{

    Node head;
    Node top;

    @Override
    public void push(T element) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T maxPeek() {
        return null;
    }

    @Override
    public T maxPop() {
        return null;
    }

    public static class Node<T> {
        Node next;
        Node prev;
        T val;
    }
}


