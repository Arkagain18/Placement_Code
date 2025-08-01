import java.util.Scanner;

public class Kadanes_Algo{
    public static long maxSubarraySum(int[] arr, int n) {
        long sum = 0;
        long maxi = Long.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum > maxi)
                maxi = sum;

            // if sum < 0: discard the sum calculation
            if(sum < 0)
                sum = 0;
        }

        if (maxi < 0)   
            maxi = 0;

        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.print("Given array is: ");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        long ans = maxSubarraySum(arr, n);
        System.out.println("Subarray sum is: " + ans);
    }
}