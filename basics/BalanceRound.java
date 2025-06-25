import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BalanceRound {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            // Map<Integer,Integer> map = new HashMap<>();
            int max =0;
            for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            max = Math.max(max,nums[i]);
            // map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
            }
            Set<Integer> set = new HashSet<>();
            for(int i = 0;i<n;i++)
            {
                set.add(nums[i]);
            }
            int ans = 1;
            for(int i  = 1;i<=max && !set.isEmpty();i++)
            {
                if(!set.contains(i-1))
                {
                    int cnt = 0;
                    while(set.contains(i))
                    {
                        
                        set.remove(i);
                        i++;
                        cnt++;
                    }
                    ans = Math.max(ans,cnt);
                }
            }
            System.out.println(n - ans);
        }
        sc.close();
 }
}


/*
 * 
 * InputCopy
7
5 1
1 2 4 5 6
1 2
10
8 3
17 3 1 20 12 5 17 12
4 2
2 4 6 8
5 3
2 3 19 10 8
3 4
1 10 5
8 1
8 3 1 4 5 10 7 3
OutputCopy
2
0
5
0
3
1
4
 */