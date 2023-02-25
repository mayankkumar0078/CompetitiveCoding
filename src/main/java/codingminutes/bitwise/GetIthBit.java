package codingminutes.bitwise;

public class GetIthBit {

  public static void main(String[] args) {
    System.out.println(getIthBit(4,20));
  }

  private static int getIthBit(int i,int num) {
    int mask = 1 << i;
    return ((num & mask) > 1) ? 1 : 0;
  }
}
