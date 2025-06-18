import java.util.Scanner;

public class AlternatingSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            sc.nextLine();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("ans:"+rec(0,-1,nums,0));
        }
    }
    private static int rec(int i,int prev,int[] nums,int sum)
    {
        if(i == nums.length)
        {
            // System.out.println(sum);
            return 0;
        }
        int pick = Integer.MIN_VALUE,dont = Integer.MIN_VALUE;
        if(prev == -1 || prev != (nums[i]>0 ? 1 : 0)) 
        pick = nums[i] + rec(i+1,nums[i]>0 ? 1 : 0,nums,sum + nums[i]);

        dont = rec(i+1,prev,nums,sum);

        return Math.max(pick,dont);
    }
}
