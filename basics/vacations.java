import java.util.Arrays;
import java.util.Scanner;

public class vacations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] days = new int[n];
        for(int i=0;i<n;i++)
        {
            days[i] = sc.nextInt();
        }
        // 0->gym
        // 1->contest
        boolean[][] table = new boolean[4][2];
        table[1][1] = true;
        table[2][0] = true;
        table[3][0] = true;
        table[3][1] = true;
        int[][] dp = new int[n+1][3];
        for(int[] row:dp) Arrays.fill(row,-1);
        int res = rec(0,-1,days,table,0,dp);
        System.out.println(res);
        sc.close();
    }
    private static int rec(int i,int prev,int[] days,boolean[][] table,int cnt,int[][] dp)
    {
        if(i == days.length)
        {
            return 0;
        }
        int prevIdx = prev == -1 ?2:prev;
        if(dp[i][prevIdx] != -1) return dp[i][prevIdx];
        int pick = Integer.MAX_VALUE, dont = Integer.MAX_VALUE;
        boolean flag = true;
        for(int j=0;j<2;j++)
        {
            if(table[days[i]][j] && j != prev)
            {
                flag = false;
                pick = Math.min(pick,rec(i+1,j,days,table,cnt,dp));
            }
        }
        if(flag) dont = 1 + rec(i+1,-1,days,table,cnt+1,dp);
        return dp[i][prevIdx] = Math.min(pick,dont);
    }
}
