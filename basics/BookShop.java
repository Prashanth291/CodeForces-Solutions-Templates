import java.util.Arrays;
import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] prices = new int[n];
        int[] pages = new int[n];
        for(int i=0;i<n;i++) prices[i] = sc.nextInt();
        for(int i=0;i<n;i++) pages[i] = sc.nextInt();
        int[][] dp = new int[n+1][x+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(0,x,prices,pages,dp));
        sc.close();
    }
    private static int rec(int i,int money,int[] prices,int[] pages,int[][] dp)
    {
        if(i>=prices.length || money<0) return -(int)1e4;
        if(money == 0) return 0;
        if(dp[i][money] != -1) return dp[i][money];
        int pick = 0;
        if(money - prices[i]>=0)
        pick = pages[i] + rec(i+1,money - prices[i],prices,pages,dp);
        int dont = rec(i+1,money,prices,pages,dp);
        return dp[i][money]  = Math.max(pick,dont);


    }
}
