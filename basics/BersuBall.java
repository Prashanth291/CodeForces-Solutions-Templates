import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BersuBall {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] boys = new int[n];
        Map<Integer,Integer> boyMap = new HashMap<>();
         Map<Integer,Integer> girlMap = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            boys[i] = sc.nextInt();
            boyMap.put(boys[i],boyMap.getOrDefault(boys[i], 0)+1);
        }
        sc.nextLine();
        int m = sc.nextInt();
        sc.nextLine();
        int[] girls = new int[m];
        for(int i=0;i<m;i++)
        {
            girls[i] = sc.nextInt();
            girlMap.put(girls[i],girlMap.getOrDefault(girls[i], 0)+1);
        }
        
        ans = 0;
        rec(0,boys,girls,boyMap,girlMap,0);
        System.out.println(ans);
        sc.close();
    }
    private static void rec(int i,int[] boys,int[] girls,Map<Integer,Integer> boyMap,Map<Integer,Integer> girlMap,int cnt)
    {
        if(i == boys.length)
        {
            // System.out.println(ans +" "+cnt);
            ans = Math.max(ans,cnt);
            return;
        }
        // System.out.println(cnt);
        int num = boys[i];
        if(girlMap.containsKey(num) && girlMap.get(num)>0)
        {
            girlMap.put(num,girlMap.get(num)-1);
            rec(i+1,boys,girls,boyMap,girlMap,cnt+1);
            girlMap.put(num,girlMap.get(num)+1);
        }
        if(girlMap.containsKey(num+1) && girlMap.get(num+1)>0)
        {
            girlMap.put(num+1,girlMap.get(num+1)-1);
            rec(i+1,boys,girls,boyMap,girlMap,cnt+1);
            girlMap.put(num+1,girlMap.get(num+1)+1);
        }
        if(girlMap.containsKey(num-1) && girlMap.get(num-1)>0)
        {
            girlMap.put(num-1,girlMap.get(num-1)-1);
            rec(i+1,boys,girls,boyMap,girlMap,cnt+1);
            girlMap.put(num-1,girlMap.get(num-1)+1);
        }
        rec(i + 1, boys, girls, boyMap, girlMap, cnt);
    }
}


/*
 * 4
1 4 6 2
5
5 1 5 7 9

 */