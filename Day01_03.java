//Sum of N natural Numbers

public class Day01_03 {
  public static void main(String[] args){
    int num = 10;
    int sum = 0;
    for(int i = 0; i <= num; i++){    // Using for loops
      sum += i;
    }
    System.out.println(sum);
  }
}

// System.out.println( num * (num + 1) /2 );      -> Using formula

/* Using Recursion

  line 3,4,5 same
  int sum = getSum(num);
  sop(sum);
}
static int getSum(int num){
  if(num == 0)
    return 0;
  return num + getSum(n-1);
}*/ 