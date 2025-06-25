import java.util.Scanner;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i] = sc.nextInt();
            }
            int ans = 0;
            boolean flag = false;
            for(int i = n-2;i>=0;i--)
            {
                if(nums[i+1] == 0)
                {
                    flag = true;
                    break;
                }
                while(nums[i]>=nums[i+1])
                {
                    nums[i]/=2;
                    ans++;
                }
            }
            System.out.println(flag ? -1 : ans);
        }
    }
}


/*
 * InputCopy
7
3
3 6 5
4
5 3 2 1
5
1 2 3 4 5
1
1000000000
4
2 8 7 5
5
8 26 5 21 10
2
5 14
OutputCopy
2
-1
0
0
4
11
0
 */
