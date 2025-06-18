import java.util.HashSet;
import java.util.Scanner;

public class Permutations {
    private static void backtrack(int i,int[] nums,HashSet<Integer> set)
    {
        if(i == nums.length)
        {
            int sum = 0;
            for(int id=0;id<nums.length;id++)
            {
                // System.out.print(nums[id]);
                sum += Math.abs(nums[id]-(id+1));
            }
            set.add(sum);
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            swap(nums,i,j);
            backtrack(i+1, nums, set);
            swap(nums, i, j);
        }

    }
    private static void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i] = i+1;
            }
            HashSet<Integer> set = new HashSet<>();
            backtrack(0,nums,set);
            System.out.println(set.size());
        }
        sc.close();
    }
}
