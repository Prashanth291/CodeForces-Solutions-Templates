import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int maxStreak = 1,currStreak = 1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                currStreak++;
            }
            else{
                maxStreak = Math.max(currStreak,maxStreak);
                currStreak = 1;
            }
        }
        maxStreak = Math.max(currStreak,maxStreak);
        System.out.println(maxStreak);
        sc.close();
    }
}
