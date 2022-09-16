// Sum of digits of a number

public class Day01_10 {
  public static void main(String[] args){
    int n = 12345, sum = 0;
    while(n != 0){
      sum += n % 10;
      n = n/10;
    }
    System.out.println(sum + " is the sum of the digits");
  }
}
