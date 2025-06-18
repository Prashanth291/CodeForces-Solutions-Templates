import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


public class Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt(),b = sc.nextInt();
            sc.nextLine();
            int xk = sc.nextInt(),yk = sc.nextInt();
            sc.nextLine();
            int xq = sc.nextInt(),yq = sc.nextInt();
            sc.nextLine();
            int[][] dir = {{a,b},{a,-b},{-a,b},{-a,-b},{b,a},{-b,a},{-b,-a},{b,-a}};
            Set<MyPair> set = new HashSet<>();
            for(int[] d:dir)
            {
                int nr = xk + d[0], nc = yk + d[1];
                set.add(new MyPair(nr, nc));
            }
            // int ans = 0;
            Set<MyPair> ans  = new HashSet<>();
            for(int [] d:dir)
            {
                int nr =  xq + d[0], nc = yq + d[1];
                if(set.contains(new MyPair(nr,nc)))
                {
                     ans.add(new MyPair(nr,nc));
                    //  System.out.println(nr+" "+nc);
                }
            }
            System.out.println(ans.size());
        }
    }
}


class MyPair {
    int r, c;

    public MyPair(int r, int c) {
        this.r = r;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPair)) return false;
        MyPair other = (MyPair) o;
        return r == other.r && c == other.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, c);
    }
}




/*
 * 4
2 1
0 0
3 3

1 1
3 1
1 3

4 4
0 0
8 0

4 2
1 4
3 4

 */
