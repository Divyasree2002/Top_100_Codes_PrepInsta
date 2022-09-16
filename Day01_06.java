//Greatest of three numbers

public class Day01_06 {
  public static void main(String[] args){
    int a = 13,b = 7, c = 12;
    if(a>b && a>c){
      System.out.println("A is greater");
    }
    else if(b>a && b>c){
      System.out.println("B is greater");
    }
    else if(c>a && c>b){
      System.out.println("C is greater");
    }
    else{
      System.out.println("invalid");
    }
  }
}


//Using ternary operator
// int temp, result;
// temp = a>b?a:b ;                                                                                                                                                              
// result = temp>c ? temp: c;
// sop(result +" is the greatest")