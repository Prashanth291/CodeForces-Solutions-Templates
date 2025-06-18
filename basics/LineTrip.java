import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt(),x = sc.nextInt();
            sc.nextLine();
            int[] bunks = new int[101];
            for(int i=0;i<n;i++)
            {
                int num = sc.nextInt();
                bunks[num] = 1;
            }
            int prev = 0;
            int ans  = 0;
            int bunkCnt = 0;
            for(int i=0;i<=x;i++)
            {
                if(bunks[i] == 1)
                {
                    int len = i - prev;
                    // System.out.println(ans+" "+len);
                    ans  = Math.max(ans,len);
                    prev = i;
                    bunkCnt++;
                }
            }
            ans = Math.max(ans,2*(x-prev));
            System.out.println(ans);
        }
        sc.close();
    }
}
