import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] lucky = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        
        int n = sc.nextInt();
        List<Integer> lucky = findLucky(n);
        System.out.println(lucky);
        boolean flag = false;
        for(int num:lucky)
        {
            if(n%num==0)
            {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
        sc.close();
    }
    public static List<Integer> findLucky(int n)
    {
        List<Integer> lucky = new ArrayList<>();        
        for(int i=1;i<=n;i++)
        {
            Set<Integer> set = new HashSet<>();
            boolean flag = true;
            int num = i;
            while(num != 0)
            {
                set.add(num%10);
                num = num/10;
            }
            // System.out.println(set);
            if(set.size()>2)
            {
                flag = false;
            }
            else{

                for(int j:set)
                {
                    if(j!=4 && j!=7)
                    {
                        flag = false;
                        break;
                    }
                }

            }
            // System.out.println(i+ " " +flag);
            if(flag) lucky.add(i);
        }
        return lucky;
    }
}
