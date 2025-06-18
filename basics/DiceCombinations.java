import java.util.Arrays;
import java.util.Scanner;

public class DiceCombinations {
    static int mod = (int)1e9 + 7;
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(rec(n,dp)%mod);
    }
    private static long rec(int target,long[] dp)
    {
        if(target<0) return 0;
        if(target==0) return 1;
        if(dp[target] != -1) return dp[target];
        dp[target] = 0;
        for(int i=1;i<7;i++)
        {
            dp[target] = (dp[target] + rec(target-i,dp)%mod);

        }
        return dp[target]%mod;
    }
}
