import java.util.*;

public class Vasilijie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            long x = sc.nextLong();

            // Map<String, Boolean> dp = new HashMap<>();
            // System.out.println(rec(n, x, k, dp) ? "YES" : "NO");
            int minSum = 0,maxSum = 0;
            for(int i = 1;i<=k;i++)
            {
                minSum += i;
                maxSum += (n-i + 1);
            }
            System.out.println((minSum<=x && x<=maxSum) ? "YES" : "NO");
        }

        sc.close();
    }

    // private static boolean rec(int i, long target, int k, Map<String, Boolean> dp) {
    //     if (i == 0 && target == 0 && k == 0) return true;
    //     if (target < 0 || i <= 0 || k < 0) return false;

    //     String key = i + "," + target + "," + k;
    //     if (dp.containsKey(key)) return dp.get(key);

    //     boolean pick = rec(i - 1, target - i, k - 1, dp);
    //     boolean dont = rec(i - 1, target, k, dp);

    //     boolean res = pick || dont;
    //     dp.put(key, res);
    //     return res;
    // }
}
