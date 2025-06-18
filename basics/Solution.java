public class Solution {
    private static int rec(int i,int[] nums,int k)
    {
        if(i >= nums.length) return 0;
        if(i==nums.length-1)
        {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int j = i+1;j<=i+k && j<nums.length;j++)
        {
            int pick = 0;
            pick = Math.abs(nums[i]-nums[j]) + rec(j,nums,k);
            res = Math.min(res,pick);
            System.out.println(pick);
        }
        return res;
        
    }
    public static int frogJump(int[] heights, int k) {
        return rec(0,heights,k);
    }
    public static void main(String[] args) {
        int[] heights = {10, 5, 20, 0, 15};
        int k =2;
        System.out.println(frogJump(heights, k));
    }
}