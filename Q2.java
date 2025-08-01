// 6.	WAP to Swap two numbers without third variable
// 7.	WAP to find out Area of a circle(radius value user given) 
// 8.	WAP to find out LCM of two numbers
// 9.	WAP to find out GCD of two numbers

import java.util.*;

public class Q2 {
    public static void swapNum(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.print("After Swapping, a = " + a + " and b = " + b);
    }

    public static void circleArea(int r) {
        double area = Math.PI * r * r;

        System.out.print("Area of circle is: " + area);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }

        if(a == 0)    return b;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        swapNum(a, b);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        circleArea(r);

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("The LCM of the two given numbers is " + lcm);

        int GCD = findGcd(a, b);
        System.out.println("GCD of the two given numbers is " + GCD);
    }
}