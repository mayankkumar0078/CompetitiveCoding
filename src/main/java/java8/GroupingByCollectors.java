package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectors {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Ramesh","Suresh","Mahesh","Dinesh","Ramesh","Mayank","Mayank");

    Map<String,Long> map = names.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    map.forEach(
        (key,value)->{
          System.out.println(key+"  "+value);
        }
    );
  }

}
