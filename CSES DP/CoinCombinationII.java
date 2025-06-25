import java.util.Arrays;
import java.util.Scanner;

public class CoinCombinationII {
    static int mod = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        // int n =  13, x = 92342;
        int[] coins = new int[n];
        for(int i=0;i<n;i++) coins[i] = sc.nextInt();
        // int[] coins = {1, 2 ,3 ,4, 67340, 67335, 67330, 67329, 67322, 67321, 67320, 67319, 67318};
        int[][] dp = new int[n+1][x+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(0,x,coins,dp)%mod);
    }
    private static int rec(int i,int target,int[] coins,int[][] dp)
    {
        if(target == 0) return 1;
        if(i>=coins.length || target<0) return 0;
        if(dp[i][target] != -1) return dp[i][target];
        int pick = 0, dont  = 0;
        pick = rec(i,target - coins[i],coins,dp);
        dont = rec(i+1,target,coins,dp);
        return dp[i][target] = (pick + dont)%mod;
    }
}
