import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Olympiad{
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
            Map<Integer,Integer> map = new HashMap<>();
            // for(int i=0;i<=9;i++)
            // map.put(i,0);
            for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
            int ans = 0;
            String date = "01032025";
            boolean flag = true;
            if(flag && map.getOrDefault(0,0)>=3)
            System.out.println(flag ? ans : 0);
        }
    }
}

/*
 * 4
10
2 0 1 2 3 2 5 0 0 1
8
2 0 1 2 3 2 5 0
8
2 0 1 0 3 2 5 0
16
2 3 1 2 3 0 1 9 2 1 0 3 5 4 0 3

 */
// 01032025
// 0 -> 3 -> 2  -> 1 -> 0
// 1 -> 2 -> 1 
//  2 -> 3 -> 2 -> 1 -> 0
//  3 -> 1 -> 0
//  5 -> 1 -> 0
