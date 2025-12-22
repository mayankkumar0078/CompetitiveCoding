package interview.linkedin;

public interface IMaxStack<T extends Comparable> {
        void push(T element);

        T pop();

        T peek();

        T maxPeek();

        T maxPop();
    }