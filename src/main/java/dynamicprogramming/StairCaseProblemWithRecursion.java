package dynamicprogramming;

public class StairCaseProblemWithRecursion {

    static int  count=0;
    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis();
        climb(35,0);
        System.out.println(count+"  "+( System.currentTimeMillis()-currentTime)/1000);
    }


    private static void climb(int totalNumberOfSetps, int current) {
        if(current == totalNumberOfSetps) {
             count++;
             return;
        }
        if(current > totalNumberOfSetps) {
            return;
        }

        climb(totalNumberOfSetps,current+1);
        climb(totalNumberOfSetps,current+2);
        climb(totalNumberOfSetps,current+3);
    }
}
