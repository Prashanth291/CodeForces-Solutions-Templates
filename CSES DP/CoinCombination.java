import java.util.Arrays;
import java.util.Scanner;

public class CoinCombination {
    static int mod = (int)1e9 +7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), x = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[x+1];
        Arrays.fill(dp,-1);
        System.out.println(rec(x,coins,dp));
        sc.close();
    }
    private static int rec(int x,int[] coins,int[] dp)
    {
        if(x <0) return 0;
        if(x == 0) return 1;
        if(dp[x] != -1) return dp[x];
        dp[x] = 0;
        for(int i=0;i<coins.length;i++)
        {
            dp[x] = (dp[x] + rec(x-coins[i],coins,dp))%mod;
        }
        return dp[x];
    }
}
