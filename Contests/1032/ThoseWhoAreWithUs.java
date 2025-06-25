import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ThoseWhoAreWithUs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] grid = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    grid[i][j] = sc.nextInt();
                }
            }
            Map<Integer,List<Pair>> map = new HashMap<>();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int key = grid[i][j];
                    max = Math.max(max,key);
                    if(map.containsKey(key))
                    {
                        map.get(key).add(new Pair(i,j));
                    }
                    else{
                        List<Pair> list = new ArrayList<>();
                        list.add(new Pair(i,j));
                        map.put(key,list);
                    }
                }
            }
            List<Pair> check = map.get(max);
            int row = check.get(0).r;
            int col = check.get(0).c;
            int srow = -1, scol = -1;
            boolean second = false;
            for(int i = 1;i<check.size();i++)
            {
                if(!second && check.get(i).r != row && check.get(i).c != col)
                {
                    srow = check.get(i).r;
                    scol = check.get(i).c;
                }
            }
            if(srow == -1 && scol == -1)
            {
                // System.out.println("IN IF");
                System.out.println(max-1);
            }
            else
            {
                boolean rowcol = true, colrow = true;
                int reqrow = row, reqcol = scol;
                for(int i=0;i<check.size();i++)
                {
                    if(check.get(i).r != reqrow && check.get(i).c != reqcol)
                    {
                        rowcol = false;
                        break;
                    }
                }
                reqrow = srow;
                reqcol = col;
                for(int i=0;i<check.size();i++)
                {
                    if(check.get(i).r != reqrow && check.get(i).c != reqcol)
                    {
                        colrow = false;
                        break;
                    }
                }
                System.out.println((rowcol || colrow) ? max-1 : max);

            }

        }
    }
}

class Pair{
    int r,c;
    public Pair(int r,int c)
    {
        this.r = r;
        this.c = c;
    }
}