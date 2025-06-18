import java.util.Scanner;

public class GellyfishA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
            System.out.println(rec(1,a,b,c,d) ? "GellyFish" : "Flower");
        }
    }
    private static boolean rec(int k,int a,int b,int c,int d)
    {
        if(b<=0) return true;
        if(a<=0) return false;
        if(k%2!=0)
        {
            if(rec(k+1,a,b-1,c,d)) return true;
            if(rec(k+1,a,b,c,d-1)) return true;
        }
        else {
            if (!rec(k + 1, a - 1, b, c, d)) return false;
            if (!rec(k + 1, a, b, c - 1, d)) return false;
            return true;
        }

        return false;
    }
}

/*
 * 5
1 2 3 4
100 999 1 1
10 20 10 30
12 14 13 11
998 244 353 107
Flower
Gellyfish
Flower
Gellyfish
Gellyfish

 */
