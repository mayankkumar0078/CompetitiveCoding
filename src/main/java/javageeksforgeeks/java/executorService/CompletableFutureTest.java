package javageeksforgeeks.java.executorService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        String str1="First";
        String str2="Second";
        CompletableFuture<String> firstCompletableFuture = CompletableFuture.supplyAsync(()->printString(str1));
        CompletableFuture<String> secondCompletableFuture=firstCompletableFuture.thenApply((s)->printString(s));
        secondCompletableFuture.thenAccept(s-> System.out.println(s));

    }


    private static String printString(String str) {
        System.out.println(str);
        return str+"1";
    }
}
