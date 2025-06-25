import java.util.Scanner;

public class ThanosLord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            boolean hasZero = false;
            int segments = 0;
            int i = 0;

            while (i < n) {
                if (nums[i] == 0) {
                    hasZero = true;
                    i++;
                    continue;
                }
                while (i < n && nums[i] != 0) {
                    i++;
                }
                segments++;
            }

            if (segments == 0) {
                System.out.println(0);
            } else if (segments == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
