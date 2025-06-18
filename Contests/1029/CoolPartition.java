import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CoolPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            {
                nums[i] = sc.nextInt();
            }
            HashMap<Integer,List<Integer>> map = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(!map.containsKey(nums[i]))
                {
                    map.put(nums[i],new ArrayList<>());
                }
                map.get(nums[i]).add(i);
            }
            
        }
        sc.close();
    }
}
