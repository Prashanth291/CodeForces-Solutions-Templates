import java.util.Scanner;

public class pushingBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int m = sc.nextInt();
            // sc.nextLine();
            int n =sc.nextInt();
            sc.nextLine();
            int[][] grid = new int[m][n];
            String[] rows = new String[m];
            for(int i=0;i<m;i++)
            rows[i] = sc.nextLine();
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    grid[i][j] = rows[i].charAt(j)-'0';
                }
            }
            boolean valid = true;
            for(int i=0;i<m && valid;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==1 && i-1>=0 && grid[i-1][j]==0 && j-1>=0 && grid[i][j-1]==0)
                    {
                        valid = false;
                        break;
                    }
                }
            }
            System.out.println(valid ? "YES" : "NO");
        }
    }
}
