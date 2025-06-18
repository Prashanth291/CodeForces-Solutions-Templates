import java.util.Scanner;

public class C {
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
            for(int i=0;i<n;i++)
            {
                int num = nums[i];
                if(num!=0 && (num&(num+1))==0)
                {
                    continue;
                }
                if(num%2==0 && k>0)
                {
                    nums[i]++;
                    k--;
                }
            }
            int ans = 0;
            for(int i=0;i<n;i++)
            {
                ans += cntSetBits(nums[i]);
            }
            System.out.println(ans);

        }
        sc.close();
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
