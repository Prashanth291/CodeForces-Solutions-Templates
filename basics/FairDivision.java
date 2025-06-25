import java.util.Arrays;
import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            int sum = 0;
            for(int i = 0;i<n;i++)
            {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
            if(sum%2 == 1)
            {
                System.out.println("NO");
            }
            else{
                int[][] dp = new int[n][sum/2 + 1];
                for(int[] row:dp) Arrays.fill(row,-1);
                System.out.println((rec(0,sum/2,nums,dp)) ? "YES" : "NO");
            }
            
        }
        
    }
    private static boolean rec(int i,int target,int[] nums,int[][] dp)
    {
        // System.out.println(target);
        if(target == 0) return true;
        if(target<0 || i>=nums.length) return false;
        if(dp[i][target] != -1) return dp[i][target] == 1;
        boolean pick = rec(i+1,target - nums[i],nums,dp);
        boolean dont = rec(i+1,target,nums,dp);
        dp[i][target] = (pick || dont) ? 1 : 0;
        return (pick || dont);
    }
}

/*
 * InputCopy
5
2
1 1
2
1 2
4
1 2 1 2
3
2 2 2
3
2 1 2
OutputCopy
YES
NO
YES
NO
NO
 */
