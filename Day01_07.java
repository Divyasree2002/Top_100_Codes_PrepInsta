// Leap Year or not

public class Day01_07 {
  public static void main(String[] args){
    int year = 2020;
    if( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
      System.out.println("It is a leap year");
    }
    else{
      System.out.println("It is not a leap year");
    }
  }
}

// Using Ternary operator
// int flag = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? 1 : 0;
// if(flag == 1){
//   System.out.println("It is a leap year")
// }
// else
//  System.out.println('It is not a leap year')


//Using Boolean Method 
//         boolean leap;

//         if (year % 400 == 0)
//             leap = true;

//         else if (year % 4 == 0 && year % 100 != 0)
//             leap = true;

//         else
//             leap = false;

//         if (leap)
//             System.out.println(year + " is a leap year.");
//         else
//             System.out.println(year + " is not a leap year.");
//     }
