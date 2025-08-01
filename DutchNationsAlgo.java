// Sort 0's, 1's and 2's in an array
import java.util.*;

public class DutchNationsAlgo {
    public static void sortArray(int []arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
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

        sortArray(arr, n);
        System.out.println();
        System.out.print("After sorting: ");
        for (int it : arr) 
            System.out.print(it + " ");
    }
}
