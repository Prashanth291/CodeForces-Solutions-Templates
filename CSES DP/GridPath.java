import java.util.Arrays;
import java.util.Scanner;

public class GridPath {
    static int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] grid = new String[n];
        for(int i=0;i<n;i++)
        {
            grid[i] = sc.nextLine();
        }
        int[][] dp = new int[n+1][n+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(0,0,grid,dp)%mod);
    }
    private static int rec(int r,int c,String[] grid,int[][] dp)
    {
        if(r>=grid.length || c>=grid.length || grid[r].charAt(c) == '*') return 0;
        if(r == grid.length-1 && c == grid.length-1) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        int right = rec(r,c+1,grid,dp);
        int down = rec(r+1,c,grid,dp);
        return dp[r][c] = (right + down)%mod;
    }
}
