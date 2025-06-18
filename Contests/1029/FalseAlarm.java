import java.util.Scanner;

public class FalseAlarm
{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            sc.nextLine();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            int left = -1,right = -1;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==1)
                {
                    if(left==-1) left = i+1;
                    right = i+1;
                }
            }
            System.out.println(x-1>=right-left ? "YES" : "NO");
        }
    }
}

// 8 8
// 1 1 1 0 0 1 1 1
// 1 2
// 1
// 5 1
// 1 0 1 0 1
// 7 4
// 0 0 0 1 1 0 1
// 10 3
// 0 1 0 0 1 0 0 1 0 0