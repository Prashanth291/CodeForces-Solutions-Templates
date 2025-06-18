import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> mprimes = new ArrayList<>();
        int num = 2;
        while(mprimes.size()<m)
        {
            if(isPrime(num))
            {
                mprimes.add(num);
            }
            num++;
        }
        System.out.println("Primes:"+mprimes);
        // reverse(mprimes);
        int[][] dp = new int[m][n+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        System.out.println(rec(m-1,n,mprimes,dp));
    }
    private static int rec(int i,int target,List<Integer> arr,int[][] dp)
    {
        if(i==0)
        {
            return (target % arr.get(0) == 0) ? target / arr.get(0) : Integer.MAX_VALUE;
        }
        if(dp[i][target] != -1) return dp[i][target];
        int pick = (int) 1e9;
        if(target>=arr.get(i)) pick = 1 + rec(i,target-arr.get(i),arr,dp);
        int dont = rec(i-1,target,arr,dp);
        return dp[i][target] = Math.min(pick , dont);

    }
    public static boolean isPrime(int n)
    {
        if(n==2) return true;
        for(int i=2;i<=(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    private static void reverse(List<Integer> a)
    {
        int i = 0,j = a.size()-1;
        while(i<=j)
        {
            int temp = a.get(j);
            a.set(j,a.get(i));
            a.set(i,temp);
            i++;
            j--;
        }
    }
}
