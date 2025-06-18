import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        reverse(nums); // 4 3 3 1 1
        int cabs = 1,avail = 4;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=avail)
            {
                avail -= nums[i];
            }
            else{
                if(map.containsKey(nums[i]) && map.get(nums[i])>0)
                {
                    map.put(nums[i],map.get(nums[i])-1);
                    continue;
                }
                map.put(avail,map.getOrDefault(avail,0 )+1);
                cabs++;
                avail = 4;
                avail -= nums[i];
            }
        }
        System.out.println(cabs);
    }
    private static void reverse(int[] nums)
    {
        int l = 0,r = nums.length-1;
        while(l<=r)
        {
            int t = nums[r];
            nums[r] = nums[l];
            nums[l] = t;
            l+=1; 
            r--;
        }
    }
}
