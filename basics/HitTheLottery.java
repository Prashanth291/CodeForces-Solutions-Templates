import java.util.Arrays;
import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        int[] bills = {100,20,10,5,1};
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[6][n+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(0,n,bills,dp));
    }
    private static int rec(int i,int target,int bills[],int[][] dp)
    {
        if (target == 0) return 0;
        if (i == bills.length) return (int)1e6;
        if(dp[i][target] != -1) return dp[i][target];
        int pick = (int)1e6,dont = (int)1e6;
        if(target>=bills[i])
        pick = 1 + rec(i,target-bills[i],bills,dp);
        dont = rec(i+1,target,bills,dp);
        return dp[i][target] = Math.min(pick,dont);
    }
}
