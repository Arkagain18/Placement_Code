// 1.	WAP to check A character is a vowel or consonant
// 2.	WAP to check A character is an alphabet or not
// 3.	WAP to find out Ascii values of a character
// 4.	WAP to identify A number is positive or negative
// 5.	WAP to identify A number is even or odd

import java.util.*;

public class Q1 {
    public static void isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }

    public static void isAlbhabet(char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet");
        else
            System.out.println(ch + " is not an alphabet");
    }

    public static void AsciiValue(char ch) {
        int val = (int)ch;
        System.out.println("ASchii value is:" + val);
    }

    public static void isPos(int num) {
        if(num > 0)
            System.out.println(num + " is positive");
        else if(num < 0)
            System.out.println(num + " is negetive");
        else
            System.out.println(num + " is Zero");
    }

    public static void isEven(int num) {
        if(num % 2 == 0)
            System.out.println(num + " is an Even Number");
        else
            System.out.println(num + " is Odd Number");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        isVowel(ch);
        isAlbhabet(ch);
        AsciiValue(ch);

        isPos(num);
        isEven(num);
    }   
}