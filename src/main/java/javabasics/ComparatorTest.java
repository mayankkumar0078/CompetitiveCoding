//package javabasics;
//
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.PriorityQueue;
//
//public class ComparatorTest {
//
//    public static void main(String[] args) {
//        compareTest();
//    }
//
//    public static void compareTest() {
//
//
//        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>((e1,e2)->);
//
//
//        priorityQueue.offer(new Employee(100.0,"Mayank"));
//        priorityQueue.offer(new Employee(105.0,"Mohan"));
//        priorityQueue.offer(new Employee(200.0,"Utkarsh"));
//        priorityQueue.offer(new Employee(106.0,"Ramesh"));
//        priorityQueue.offer(new Employee(110.0,"Suresh"));
//
//
//
//        Iterator<Employee> iterator =  priorityQueue.iterator();
//        int i=0;
//        while (i<priorityQueue.size()) {
//            System.out.println(priorityQueue.poll());
//        }
//
//
//    }
//
//    public static class Employee{
//        public Employee(double salary, String name) {
//            this.salary = salary;
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "Employee{" +
//                    "salary=" + salary +
//                    ", name='" + name + '\'' +
//                    '}';
//        }
//
//        public Double salary;
//        public String name;
//        //public String dept;
//    }
//}
