import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaxiWala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int cabs = map.getOrDefault(4,0);
        int threeone = Math.min(map.getOrDefault(3, 0),map.getOrDefault(1, 0));
        cabs += threeone;
        map.put(4,0);
        if(map.containsKey(3) && map.get(3)>0)        
        {
            map.put(3,map.get(3)-threeone);
        }
        if(map.containsKey(1) && map.get(1)>0)        
        {
            map.put(1,map.get(1)-threeone);
        }
        // System.out.println(map);
        if(map.containsKey(2))
        cabs += (int)Math.ceil((double)map.get(2)/2);
        if(map.containsKey(1) && map.get(1)>0)
        cabs += (int)Math.ceil((double)map.get(1)/4);
        if(map.containsKey(3))
        cabs += map.get(3);
        System.out.println(cabs);
        
    }
}
