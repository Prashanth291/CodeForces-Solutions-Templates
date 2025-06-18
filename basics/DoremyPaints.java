import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoremyPaints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n =sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) nums[i] = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            
            for(int num:nums)
            {
                map.put(num,map.getOrDefault(num, 0)+1);
            }
            if(map.size()>2)
            {
                System.out.println("NO");
            }
            else if(map.size() == 1)
            {
                System.out.println("YES");
            }
            else{
                // int unqs = 0;
                boolean flag = true;
                for(int key:map.keySet())
                {
                       int freq = map.get(key);
                       if(freq != Math.ceil((double)n/(double)2) && freq != Math.floor((double)n/(double)2))
                       {
                        flag = false;
                        break;
                       }

                }
                System.out.println(flag ? "YES" : "NO");
            }
        }
    }
}

/*
 * 5
2
8 9
3
1 1 2
4
1 1 4 5
5
2 3 3 3 3
4
100000 100000 100000 100000



Yes
Yes
No
No
Yes

 */