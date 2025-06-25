import java.util.PriorityQueue;
import java.util.Scanner;

public class PermutationSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
            
            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(a.num,b.num));
            // int a = 0;
            for(int i = 0;i<n;i++) pq.offer(new Pair(nums[i],i+1));

            int a = Math.abs(pq.peek().idx - 1);
            int i = 0;
            while(i+1 == pq.peek().idx)
            {
                a = Math.abs((i+1) - pq.peek().idx);
                pq.poll();
                i++;
                // System.out.println(a);
            }
            // System.out.println(a);
            while(i<n)
            {
                int b = Math.abs((i+1)-pq.peek().idx);
                pq.poll();
                if(b != 0) a = gcd(a,b);
                i++;
                // System.out.println("loop-2"+a);
            }
            System.out.println(a);
        }
    }
    private static int gcd(int a,int b)
    {
        while(b != 0 )
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

class Pair
{
    int num, idx;
    public Pair(int num,int idx)
    {
        this.num = num;
        this.idx = idx;
    }
}