
import java.util.Scanner;

public class ArrayDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(rec(0,m,nums));
    }
    private static int rec(int i,int m,int[] nums)
    {
        if(i == nums.length)
        {
            // for(int num:nums)
            // System.out.print(num+" ");
            // System.out.println();
             return 1;
        }
        if(nums[i] != 0  && i-1>=0 && Math.abs(nums[i-1] - nums[i])>1) return 0;
        int pick = 0;
        if(nums[i] == 0)
        {
            for(int j = 1;j<=m;j++)
            {
                
                if((i-1>=0 && Math.abs(nums[i-1] - j) <= 1) || i == 0){
                nums[i] = j;
                pick += rec(i+1,m,nums);
                }
            }
            nums[i] = 0;
        }
        else{
            pick = rec(i+1,m,nums);
        }
        return pick;
    }
}
