import java.util.*;

public class AssignCaps{
    static int ans = 0;
    private static void rec(int i,List<List<Integer>> caps,HashSet<Integer> set)
    {
        if(i == caps.size())
        {
            ans++;
            return;
        }
        System.out.println("IN REC");
        for(int j=0;j<caps.get(i).size();j++)
        {
            if(!set.contains(caps.get(i).get(j)))
            {
                set.add(caps.get(i).get(j));
                rec(i+1,caps,set);
                set.remove(caps.get(i).get(j));
            }
        }
    }
    private static void func(List<List<Integer>> caps)
    {
        // int n = caps.size();
        HashSet<Integer> set = new HashSet<>();
        rec(0,caps,set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> ques = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<p;j++)
            {
                int num = sc.nextInt();
                l.add(num);
            }
            ques.add(l);

        }
        func(ques);
        System.out.println(ans);
        sc.close();
    }
}