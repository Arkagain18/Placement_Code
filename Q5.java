// 20.	WAP to identify an user given number is Prime number or not
// 21.	WAP to identify an user given number is Palindrome or not
// 22.	WAP to identify an user given number is Armstrong number or not
// 23.	WAP to identify an user given number is Strong number or not

import java.util.*;

public class Q5 {
    public static boolean isPrime(int n) {
        if(n <= 1)  return false;

        for(int i = 2; i < n; i++) {
            if(n % i == 0)  return false;
        }

        return true;
    }

    public static int reversNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static boolean Armstrong(int n) {
        int digit = 0;
        int b = n;
        int armst = 0;
        int rem = 0;

        while(n != 0) {
            n = n / 10;
            digit ++;
        }
        n = b;

        while(n > 0) {
            rem = n % 10;
            armst += Math.pow(rem, digit);
            n /= 10; 
        }

        return armst == b;
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++)
            fact *= i;
        
        return fact;
    }

    public static boolean isStrong(int n) {
        int org = n;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        return sum == org;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if(isPrime(n))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime Number");

        int revN = reversNumber(n);
        if(revN == n)
            System.out.println("Pallindrome Number");
        else
            System.out.println("Not a Pallindrome Number");

        if(Armstrong(n))
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");

        if (isStrong(n)) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }
    }
}