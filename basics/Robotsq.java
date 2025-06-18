import java.util.Arrays;
import java.util.Scanner;

public class Robotsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[][] arr = new int[401][401];
        int r = 200, c = 200;
        arr[200][200] = 1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'U')
            {
                 arr[r-1][c] = 1;
                 r--;
            }
            else if(ch == 'D')
            {
                arr[r+1][c] = 1;
                 r++;
            }
            else if(ch=='L')
            {
                arr[r][c-1] = 1;
                c--;
            }
            else if(ch == 'R')
            {
                arr[r][c+1] = 1;
                c++;
            }
            // System.out.println(r+" "+c);
        }
        if(r!=200 || c!=200)
        {
            System.out.println(0);
        }
        else{
            int[][] dp = new int[401][401];
            for(int[] row:dp) Arrays.fill(row,-1);
            boolean[][] visited = new boolean[401][401];
            System.out.println(rec(200,200,arr,dp,visited));
        }
    }
    private static int rec(int r,int c,int[][] arr,int[][] dp,boolean[][] visited)
    {
        if(r<0 || r>=401 || c<0 || c>=401 || arr[r][c] != 1 || visited[r][c]) return 0;
        if(r==200 && c==200 && visited[r][c]) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        visited[r][c] = true;
        int up = rec(r-1,c,arr,dp,visited);
        int down = rec(r+1,c,arr,dp,visited);
        int left = rec(r,c-1,arr,dp,visited);
        int right = rec(r,c+1,arr,dp,visited);
        visited[r][c] = false;
        return dp[r][c] = up + down + left + right;
    }
}
