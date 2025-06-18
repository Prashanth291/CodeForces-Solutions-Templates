import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextLong();  // Use long here!
            }

            long low = 0, high = sum;
            boolean isPerfectSquare = false;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                long sq = mid * mid;

                if (sq == sum) {
                    isPerfectSquare = true;
                    break;
                } else if (sq < sum) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(isPerfectSquare ? "YES" : "NO");
        }

        sc.close();
    }
}
