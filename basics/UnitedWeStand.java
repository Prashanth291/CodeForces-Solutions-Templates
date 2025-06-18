import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
            for(int num:nums)
            {
                max = Math.max(num,max);
                min = Math.min(min,num);
            }
            if(max == min)            
            {
                System.out.print(-1);
            }
            else{
                List<Integer> b = new ArrayList<>();
                List<Integer> c = new ArrayList<>();
                for(int num:nums)
                {
                    if(num == max)
                    {
                        b.add(num);
                    }
                    else c.add(num);
                }
                System.out.println(c.size()+" "+b.size());
                    for(int num:c)
                    System.out.print(num+" ");
                    System.out.println();
                    for(int num:b)
                    System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
