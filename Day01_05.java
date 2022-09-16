//Greatest of 2 numbers

public class Day01_05 {
  public static void main(String[] args){
    int a =5;
    int b =9;
    if(a>b)
      System.out.println("A is the greatest number");     //-> Using if else statements
    else if(a<b)
      System.out.println("B is the greatest number");
    else
      System.out.println("A and B are equal");
  }
}

// Using ternary operator
// String result = a>b ? "A is greater" : "B is greater" ;

//Inbuilt max function
//int result = Math.max(a,b);
// sop(result + "is greater");