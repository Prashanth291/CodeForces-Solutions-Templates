import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(rec(n,a,b,c,dp));
        sc.close();
    }
    private static int rec(int n,int a,int b,int c,int[] dp)
    {
        if(n==0) return 0;
        if(n<0) return Integer.MIN_VALUE;
        if(dp[n] != -1) return dp[n];
        int aa=0,bb=0,cc=0;
        aa = rec(n-a,a,b,c,dp);
        bb = rec(n-b,a,b,c,dp);
        cc = rec(n-c,a,b,c,dp);
        int maxCuts = Math.max(aa, Math.max(bb, cc));    
        if (maxCuts == Integer.MIN_VALUE) return dp[n] = Integer.MIN_VALUE;
        return dp[n] = maxCuts + 1;
    }
}
