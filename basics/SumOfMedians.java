import java.util.Arrays;
import java.util.Scanner;

public class SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] nums = new int[n*k];
            for(int i=0;i<n*k;i++)
            {
                nums[i] = sc.nextInt();
            }
            long ans = 0;
            int jump = n/2+1;
            int idx = n * k - jump;

            for (int i = 0; i < k; i++) {
                ans += nums[idx];
                idx -= jump;
            }

            System.out.println(ans);
        }
    }
}

/*
 * 6
2 4
0 24 34 58 62 64 69 78
2 2
27 61 81 91
4 3
2 4 16 18 21 27 36 53 82 91 92 95
3 4
3 11 12 22 33 35 38 67 69 71 94 99
2 1
11 41
3 3
1 1 1 1 1 1 1 1 1
OutputCopy
165
108
145
234
11
3
 */
