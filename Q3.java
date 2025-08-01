// 10.	WAP to find out  Greatest of two numbers
// 11.	WAP to find out Greatest of three numbers
// 12.	WAP to find out Number of digits in an integer
// 13.	WAP to find out Sum of digits of a number
// 14.	WAP to find out Sum of N natural numbers
// 15.	WAP to find out Sum of numbers in a given range

import java.util.*;

public class Q3 {
    public static void greaterTwo(int a, int b) {
        if(a > b)
            System.out.print(a + " is greatest among two");
        else    
            System.out.print(b + " is greatest among two");
    }

    public static void greaterThree(int a, int b, int c) {
        if(a > b && a > c)
            System.out.print(a + " is greatest among three");
        else if(b > c && b > a)   
            System.out.print(b + " is greatest among three");
        else
            System.out.print(c + " is greatest among three");
    }

    public static void digitCnt(int num) {
        int cnt = 0, temp = num;

        if (num == 0)    System.err.println("1");;

        while(temp >  0) {
            temp /= 10;
            cnt++;
        }

        System.out.println("Digit Count: " + cnt);
    }

    public static void digitSum(int num) {
        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.print("Digit Sum: " +sum );
    }

    public static void rangeSum(int num) {
        int sum = 0;

        for(int i = 1; i <= num; i++) 
            sum += i;

        System.out.print("Digit Sum: " +sum );
    }

    public static void sumNaturalNumber(int num) {
        System.out.println("Sum of natural naumber is = " + ((num * (num + 1)) / 2));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        greaterTwo(a, b);
        greaterThree(a, b, c);
        digitCnt(num);
        digitSum(num);
        sumNaturalNumber(num);
        rangeSum(num);
    }
}