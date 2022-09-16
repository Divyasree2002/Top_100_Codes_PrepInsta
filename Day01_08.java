// Prime or not

public class Day01_08 {
  public static void main(String[] args){
    int n =23;
    checkPrime(n);
  }

  private static void checkPrime(int n){
    int count = 0;
    if(n<2)
      System.out.println("It is Not Prime");
    for(int i=1;i<=n;i++){
      if(n%i == 0)
        count += 1;
    }
    if(count > 2)     // Factors of number
      System.out.println("It is not prime");
    else
      System.out.println("It is Prime");
  }

}
