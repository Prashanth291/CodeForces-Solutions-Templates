import java.util.Scanner;

public class JellyFishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // sc.nextLine();
        while(t-->0)
        {
            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
            int[] nums = new int[n];
            // sc.nextLine();
            for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
            long seconds = 0;
            int greats = 0;
            for(int i=0;i<n;i++)
            {
                if(nums[i]>=a) greats++;
                else if(nums[i]<a) seconds += nums[i];
            }
            System.out.println(b + seconds + greats * (a-1));
        }
    }
}
// class Pair{
//     int val, idx;
//     public Pair(int v,int i)
//     {
//         this.val = v;
//         this.idx = i;
//     }
// }