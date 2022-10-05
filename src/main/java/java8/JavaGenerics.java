package java8;

import java.util.Arrays;
import java.util.List;

public class JavaGenerics {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,20,30,40,50);
    System.out.println(sumNums(list));
  }

  public static double sumNums(List<? extends Number> list) {
    return list.stream().mapToDouble(Number::doubleValue).sum();
  }
}
