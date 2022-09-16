//Sum between two ranges of numbers

public class Day01_04 {
  public static void main(String[] args){
    int a = 5;
    int b = 10;
    int sum = 0;
  //   for (int i = a ; i <= b; i++){    //Using for loops
  //       sum += i;
  //   }
  //   System.out.print(sum);
  // }
// }
// Sop((b*(b+1)/2) - (a*(a+1)/2) + a);    ->Using Formula

// /*Using Recursion
//   same as line 3,4,5,6
    sum = getSum(0,a,b);
  System.out.println(sum);
}
static int getSum(int sum,int a,int b){
  if(a>b)
    return sum;
  return a + getSum(sum,a+1,b);
} 
}
