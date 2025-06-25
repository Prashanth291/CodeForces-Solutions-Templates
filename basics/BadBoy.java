import java.util.Scanner;

public class BadBoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), i = sc.nextInt(),j = sc.nextInt();
            int[][] edges = {{1,1},{n,1},{1,m},{n,m}};
            int[] ans = new int[4];
            int max = -1;
            Pair st = new Pair(i,j);
            for(int row =  0;row<4;row++)
            {
                for(int col = row+1;col<4;col++)
                {
                    Pair xa = new Pair(edges[row][0],edges[row][1]);
                    Pair yb = new Pair(edges[col][0],edges[col][1]);
                    int dist = distance(xa, yb) + Math.min(
                        distance(st, xa) + distance(yb, st),
                        distance(st, yb) + distance(xa, st)
                    );

                    if(max<=dist)
                    {
                        ans[0] = edges[row][0];
                        ans[1] = edges[row][1];
                        ans[2] = edges[col][0];
                        ans[3] = edges[col][1];
                        max = dist;
                    }
                }
            }
            for(int l = 0;l<4;l++)
            {
                System.out.print(ans[l]+" ");
            }
            System.out.println();
        }
    }
    private static int distance(Pair a,Pair b)
    {
        return Math.abs(a.r-b.r) + Math.abs(a.c - b.c);
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


// InputCopy
// 7
// 2 3 1 1
// 4 4 1 2
// 3 5 2 2
// 5 1 2 1
// 3 1 3 1
// 1 1 1 1
// 1000000000 1000000000 1000000000 50
// OutputCopy
// 1 2 2 3
// 4 1 4 4
// 3 1 1 5
// 5 1 1 1
// 1 1 2 1
// 1 1 1 1
// 50 1 1 1000000000
