import java.util.Arrays;
import java.util.Scanner;

public class MinimizingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i] = sc.nextInt();
        }
        // Arrays.s
        int[][] dp = new int[n+1][x+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        int res = rec(0,x,coins,dp);
        System.out.println( res == (int)1e6 ? -1 : res);
    }
    private static int rec(int i,int target,int[] coins,int[][] dp)
    {
        if(target<0 || i>=coins.length) return (int)1e6;
        if(target == 0) return 0;
        if(dp[i][target] != -1) return dp[i][target];
        int pick = 1 + rec(i,target-coins[i],coins,dp);
        int dont = rec(i+1,target,coins,dp);
        return dp[i][target] = Math.min(pick,dont);
    }
}
