import java.util.*;

public class BeautifulMatrix {
    static class Pair {
        int u, v, w;
        public Pair(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int r = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    r = i;
                    c = j;
                }
            }
        }

        int[][] dist = new int[5][5];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[r][c] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.w, b.w));
        pq.offer(new Pair(r, c, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.u, v = curr.v, w = curr.w;
            int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
            for (int[] dir : dirs) {
                int nr = u + dir[0], nc = v + dir[1];
                if (isValid(nr, nc)) {
                    if (dist[nr][nc] > w + 1) {
                        dist[nr][nc] = w + 1;
                        pq.offer(new Pair(nr, nc, dist[nr][nc]));
                    }
                }
            }
        }

        sc.close();
        System.out.println(dist[2][2]);
    }

    public static boolean isValid(int r, int c) {
        return ((0 <= r && r < 5) && (0 <= c && c < 5));
    }
}
