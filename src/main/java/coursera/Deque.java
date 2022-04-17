package coursera;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    private int front =0,rear=0;
    private Item arr[];
    int initialSize =10;
    // construct an empty deque
    public Deque() {
        arr = (Item[])new Object[initialSize];
    }

//    // is the deque empty?
//    public boolean isEmpty();
//
//    // return the number of items on the deque
//    public int size();
//
//    // add the item to the front
//    public void addFirst(Item item);
//
//    // add the item to the back
//    public void addLast(Item item);
//
//    // remove and return the item from the front
//    public Item removeFirst();
//
//    // remove and return the item from the back
//    public Item removeLast();
//
//    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return null;
    }
//
//    // unit testing (required)
    public static void main(String[] args) {

    }

}