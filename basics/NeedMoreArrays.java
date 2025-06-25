import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NeedMoreArrays {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        // int[][] dp = new int[n][n+1];
        // for(int[] row:dp) Arrays.fill(row,-1);
        HashMap<String, Integer> memo = new HashMap<>();
        System.out.println(rec(0,-1,nums,memo));
    }
   } 
   private static int rec(int i,int prev,int[] nums,HashMap<String, Integer> memo )
   {
    if(i == nums.length) return 0;
    int prevIdx = (prev == -1) ? nums.length : prev;
    // if(dp[i][prevIdx] != -1) return dp[i][prevIdx];
    String key = i+","+prevIdx;
    if(memo.containsKey(key)) return memo.get(key);
    int prevVal = (prev==-1) ? (int)-1e9 : nums[prev];
    int pick = 0, dont = 0;
    if(prevVal+1<nums[i])
    pick = 1 + rec(i+1,i,nums,memo);
    else
    pick = rec(i+1,i,nums,memo);
    dont = rec(i+1,prev,nums,memo);
    // System.out.println(i+" "+prev+" "+pick+" "+dont);
    memo.put(key,Math.max(pick,dont));
    return Math.max(pick,dont);
   }
}
/*
 * InputCopy
6
6
1 2 3 4 5 6
3
1 2 3
4
1 2 2 4
1
2
3
1 4 8
2
1 1
OutputCopy
3
2
2
1
3
1
 */