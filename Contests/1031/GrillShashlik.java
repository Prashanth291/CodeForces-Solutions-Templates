import java.util.Scanner;

public class GrillShashlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long ans = 0;

            if (k < Math.min(a, b)) {
                sb.append("0\n");
                continue;
            }

            if (x * b < y * a) {
                while (k >= a) {
                    long countA = (k - a) / x + 1;
                    ans += countA;
                    k -= countA * x;
                }
                while (k >= b) {
                    long countB = (k - b) / y + 1;
                    ans += countB;
                    k -= countB * y;
                }
            } else {
                while (k >= b) {
                    long countB = (k - b) / y + 1;
                    ans += countB;
                    k -= countB * y;
                }
                while (k >= a) {
                    long countA = (k - a) / x + 1;
                    ans += countA;
                    k -= countA * x;
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
/*
 * 5
10 3 4 2 1
1 10 10 1 1
100 17 5 2 3
28 14 5 2 4
277 5 14 1 3

 */