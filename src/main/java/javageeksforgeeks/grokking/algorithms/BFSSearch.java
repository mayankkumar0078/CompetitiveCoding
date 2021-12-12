package javageeksforgeeks.grokking.algorithms;

import java.util.*;

public class BFSSearch {
    public static void main(String[] args) {
        Map<Integer, Set<Integer>> graph = createGraph();
        System.out.println(checkConnectionBFS(graph,1,18));
    }

    private static boolean checkConnectionBFS(Map<Integer, Set<Integer>> graph, int startingPoint, int endingPoint) {
        Queue<Integer> bfsQueue = new ArrayDeque<>();
        Map<Integer,Boolean> visited = new HashMap<>();
        bfsQueue.add(startingPoint);
        while (!bfsQueue.isEmpty()) {
            int value = bfsQueue.poll();
            if(visited.get(value) != null) {
                continue;
            }
            if(value == endingPoint) {
                return true;
            }
            if(graph.get(value) !=null) {
                bfsQueue.addAll(graph.get(value));
            }
            visited.put(value,true);

        }
        return false;
    }

    public static Map<Integer, Set<Integer>> createGraph() {
        Map<Integer, Set<Integer>> graph = new HashMap<>();


        graph.put(1,new HashSet<Integer>(Arrays.asList(2,3,4)));
        graph.put(2,new HashSet<Integer>(Arrays.asList(5,6)));
        graph.put(3,new HashSet<Integer>(Arrays.asList(2,3,9)));
        graph.put(4,new HashSet<Integer>(Arrays.asList(10,11,12)));
        graph.put(5,new HashSet<Integer>(Arrays.asList(2,7,18)));
        return graph;
    }
}
