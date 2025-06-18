import java.util.Scanner;

public class HaloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(),k = sc.nextInt();
            sc.nextLine();
            int maxStreak = 1,currStreak = 1;
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            if(k == 1)
            {
                // System.out.println("IN IF");
                boolean flag = true;
                for(int i=1;i<n;i++)
                {
                    if(nums[i]<nums[i-1])
                    {
                        flag = false;
                        break;
                    }
                }
                
                System.out.println(flag ? "YES" : "NO");
            }
            else{
                // System.out.println("IN ELSE");
                // for(int i=1;i<n;i++)
                // {
                //     if(nums[i]<nums[i-1]) currStreak++;
                //     else{
                //         maxStreak = Math.max(currStreak,maxStreak);
                //         currStreak = 1;
                //     }
                // }
                // maxStreak = Math.max(currStreak,maxStreak);
                // // System.out.println(maxStreak);
                System.out.println("YES");
                }
        }
        sc.close();
    }
}


/*
 * 
 *
3 2
1 2 3
3 1
9 9 9
4 4
6 4 2 1
4 3
10 3 830 14
2 1
3 1
 */