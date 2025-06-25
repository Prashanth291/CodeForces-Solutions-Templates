import java.util.Arrays;
import java.util.Scanner;

public class CoinMinimizationIIusing2D {
    static int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++) coins[i] = sc.nextInt();
        int[][] dp = new int[n][x+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(0,x,coins,dp));
    }
    private static int rec(int i,int target,int[] coins,int[][] dp)
    {
        if(target<0 || i>=coins.length) return 0;
        if(target == 0) return 1;
        int pick = 0, dont = 0;
        if(dp[i][target] != -1) return dp[i][target];
        pick = rec(i,target-coins[i],coins,dp);
        dont = rec(i+1,target,coins,dp);
        return dp[i][target] =( pick + dont)%mod ;
    }
}
