package coursera;

public class StackWithMax {
    public static class Stack {
        Integer arr[];
        int top = -1;
        Integer max = Integer.MIN_VALUE;

        public Stack() {
            arr = new Integer[10];
        }

        public void push(Integer item) {
            if (item > max) {
                max = item;
            }
            if (top == arr.length - 1) {
                Integer arrCopy[] = arr;
                arr = new Integer[(arr.length * 2) + 1];
                for (int i = 0; i < arrCopy.length; i++) {
                    arr[i] = arrCopy[i];
                }
            }
            arr[++top] = item;
        }

        public Integer pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return null;
            }
            Integer item = arr[top];
            arr[top] = null;
            top--;
            if (item == max) {
                findMax();
            }
            if (top < arr.length / 2) {
                Integer arrCopy[] = arr;
                arr = new Integer[(arr.length / 2) + 1];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arrCopy[i];
                }
            }
            return item;
        }

        private void findMax() {
            max = Integer.MIN_VALUE;
            for (int i = 0; i <= top; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public Integer max() {
            return max;
        }
    }


}
