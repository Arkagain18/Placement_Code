// Find the majority element from an array that occures > n/2 times
import java.util.*;

import java.lang.reflect.Array;

public class Majority_El {
    public static int majorityElement(int []v) {
        int cnt = 0;
        int el = 0;

        for(int i = 0; i < v.length; i++){
            if(cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if(v[i] == el){
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i = 0; i < v.length; i++) {
            if(v[i] == el)  cnt1++;
        }

        if(cnt1 > (v.length / 2))   return el;

        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.print("Given array is: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        int ans = majorityElement(arr);
        System.out.print("Majority Element is : " + ans);
    }
}
