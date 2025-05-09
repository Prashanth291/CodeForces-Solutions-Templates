import java.util.Scanner;
public class softdrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n, k, l, c, d, p, nl, np
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        System.out.println((Math.min((int)k*l/n,Math.min((int)p/np,c*d)))/n);  // 5 100 10 1 19 90 4 3
        // 100* 10/5, 90*3, 1 * 19   200,270,19 19/5 3
    }
    
}
