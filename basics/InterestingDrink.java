import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i] = sc.nextInt();
        }
        sc.nextLine();
        int q = sc.nextInt();
        Arrays.sort(prices);
        for(int i=0;i<q;i++)
        {
            int mid = sc.nextInt();
            // if(mid<prices[0]) System.out.println(0);
            System.out.println(BinarySearch(prices,mid));
            sc.nextLine();
        }

    }
    private static int BinarySearch(int[] nums,int target)
    {
        int low = 0, high = nums.length-1;
        int mid = 0,ans = high;
        while(low<=high)
        {
            mid = low + (high - low)/2;
            if(nums[mid]>target)
            {
                high = mid - 1;
                // ans = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return high+1;
    }
}
