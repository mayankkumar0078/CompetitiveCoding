package java8;

import java.util.function.Consumer;

public class ConsumerTest {

  public static void main(String[] args) {
    ConsumerTest consumerTest = new ConsumerTest();
    String test = "test";
    Consumer<String> consumer = (test1)->System.out.println(test1);
  }


  public void run(Consumer<String> consumer) {
    consumer.accept("Mayank");
  }
}
