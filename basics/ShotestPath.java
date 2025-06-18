import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShotestPath {
    static class Pair
    {
        int u,v,w;
        public Pair(int u,int v,int w)
        {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
        int[] st = new int[2];
        int[] dest = new int[2];
        int[] obs = new int[2];
        for(int i=0;i<2;i++) st[i] = sc.nextInt();
        for(int i=0;i<2;i++) dest[i] = sc.nextInt();
        for(int i=0;i<2;i++) obs[i] = sc.nextInt();
        int n = Math.max(Math.max(st[0],st[1]),Math.max(Math.max(dest[1],dest[0]),Math.max(obs[0],obs[1])));
        // int[][] grid = new int[n+1][n+1];
        int[][] dist = new int[n+1][n+1];
        for(int[] row:dist) Arrays.fill(row,Integer.MAX_VALUE);
        // grid[st[0]][st[1]] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(st[0],st[1],0));
        dist[st[0]][st[1]] = 0;
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            Pair curr = q.poll();
            int u = curr.u, v = curr.v, w = curr.w;
            for(int[] dir:directions)
            {
                int nr = dir[0] + u, nc = v + dir[1];
                if(isValid(nr,nc,n) && !(nr==obs[0] && nc==obs[1]) && dist[nr][nc] > w + 1)
                {
                    dist[nr][nc] = w + 1;
                    q.offer(new Pair(nr,nc,dist[nr][nc]));
                }
            }

        }
        System.out.println(dist[dest[0]][dest[1]]);
    }

    sc.close();
   } 
   private static boolean isValid(int r,int c,int n)
   {
    return ((0<=r && r<=n) && (0<=c && c<=n));
   }
}
