import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            // sc.nextLine();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            Arrays.sort(nums);
            int maxStreak = 1,currStreak = 1;
            for(int i = 1;i<n;i++)
            {
                if(nums[i] - nums[i-1] <=k)
                {
                    currStreak++;
                }
                else{
                    // maxStreak = Math.max(currStreak,maxStreak);
                    currStreak = 1;
                    
                }
                // System.out.println("HI");
                maxStreak = Math.max(currStreak,maxStreak);
                
            }
            // maxStreak = Math.max(currStreak,maxStreak);
            System.out.println(n - maxStreak);
        }
        sc.close();
    }
}
/*
 * 7
5 1
1 2 4 5 6
1 2
10
8 3
17 3 1 20 12 5 17 12
4 2
2 4 6 8
5 3
2 3 19 10 8
3 4
1 10 5
8 1
8 3 1 4 5 10 7 3
2
0
5
0
3
1
4

 */