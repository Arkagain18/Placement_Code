// 16.	WAP to find out Reverse of a given number
// 17.	WAP to find out Factorial of a number
// 18.	WAP to find out Fibonacci series up to n 
// 19.	WAP to find out Leap year or not


import java.util.*;

public class Q4 {
    public static void leapYear(int year) {
        if((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0))
            System.out.print(year + " is a Leap Year");
        else    System.out.println(year + " is not a Leap Year");
    }

    public static void reverseNum(int n) {
        int revNum = 0;

        while(n != 0) {
            revNum = 10 * revNum + (n % 10);
            n = n / 10;
        }

        System.out.print("Reversed Numer : " + revNum);
    }

    public static void factorial(int n) {
        long fact = 1;
        if(n < 0)
            System.out.print("No factorial");
        else {
            for(int i = 1; i <= n; i++)
                fact = fact * i;
            
            System.err.print("Factprial is: " + fact);
        }
    }

    public static void fibonacci(int n) {
        int ft = 0, st = 1;
        System.out.println("Fibonacci Series Upto " + n + ": ");
    
        while (ft <= n) {
            System.out.print(ft + ", ");

            int temp = ft + st;
            ft = st;
            st = temp;

        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        leapYear(year);
        reverseNum(n);
        factorial(n);
        fibonacci(n);
    }
}
