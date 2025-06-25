import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemovingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n;
        List<Integer> ds = new ArrayList<>();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(rec(n,ds,dp));
    }
    private static int rec(int i,List<Integer> ds,int[] dp)
    {
        if(i<0) return Integer.MAX_VALUE;
        if(i == 0) 
        {
            // System.out.println(ds);
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        List<Integer> digits = digitsList(i);
        int res = Integer.MAX_VALUE;
        for(int j=0;j<digits.size();j++)
        {
        if(digits.get(j) != 0){
            ds.add(i);
            res =  Math.min(res,rec(i-digits.get(j),ds,dp));
            ds.remove(ds.size()-1);
        }
        }
        return dp[i] = 1+res;
    }
    private static List<Integer> digitsList(int n)
    {
        int d = n;
        List<Integer> digits = new ArrayList<>();
        while(d != 0)
        {
            digits.add(d%10);
            d = d/10;
        }
        return digits;
    }
}






/* -2 -0 -1 2 -3 -2 -5 -0 -0 1 -> 01.03 .2025*/