import java.util.PriorityQueue;
import java.util.Scanner;

public class MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            sc.nextLine();
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i] = sc.nextInt();
            }
            PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(a.lub,b.lub));
            for(int i=0;i<n;i++)
            {
                pq.offer(new Pair(nums[i],LeastUnsetBit(nums[i]),i));
            }
            while(k>0 && !pq.isEmpty())
            {
                Pair curr = pq.poll();
                System.out.println(curr.num+" "+curr.lub+" "+curr.idx);
                k -= curr.lub;
                nums[curr.idx] = curr.num+curr.lub;
                int updatedNum = curr.num + curr.lub;
                int nextLub = LeastUnsetBit(updatedNum);
                if (nextLub != -1)
                    pq.offer(new Pair(updatedNum, nextLub, curr.idx));

            }
            int ans = 0;
            for(int i=0;i<n;i++)
            {
                ans += cntSetBits(nums[i]);
            }
            System.out.println(ans);
        }
    }
    private static int LeastUnsetBit(int n)
    {
        for(int i=0;i<32;i++)
        {
            if((n & (1<<i)) == 0)
            {
                return 1<<i;
            }
        }
        return -1;
    }
    private static int cntSetBits(int d)
    {
        int n = d,cnt=0;
        while(n!=0)
        {
            n = n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
class Pair{
    int num,lub,idx;
    public Pair(int n,int l,int i)
    {
        this.lub = l;
        this.num = n;
        this.idx=i;
    }
}