import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class PrettyPermutations {
        public static void GeneratePermutations(int i,int[] nums,PriorityQueue<Pair> pq )
        {
            if(i==nums.length)

            {
                List<Integer> l = new ArrayList<>();
                int diff = 0;
                for(int p=0;p<nums.length;p++)
                {
                    diff += Math.abs(nums[p]-p+1);
                    l.add(nums[p]);
                }
                pq.offer(new Pair(diff,l));
                if(pq.size()>1) pq.poll();
                return;
            }
            for(int j=i;j<nums.length;j++)
            {
                swap(nums,i,j);
                GeneratePermutations(i+1, nums, pq);
                swap(nums,i,j);
            }
        }
    private static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(b.num - a.num));
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            nums[i] = i+1;
            GeneratePermutations(0,nums,pq);
            Pair ans = pq.poll();
            List<Integer> ansList = ans.arr;
            // System.out.println(ansList);
            for(int num:ansList)
            System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
class Pair
{
    int num;
    List<Integer> arr;
    public Pair(int num,List<Integer> l)
    {
        this.num = num;
        this.arr = new ArrayList<>(l);
    }
}