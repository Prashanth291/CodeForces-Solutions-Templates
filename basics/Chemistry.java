import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt(), k = sc.nextInt();
            sc.nextLine();
            // int[] map = new int[26];
            Map<Character,Integer> map = new HashMap<>();
            String s = sc.nextLine();
            for(char ch:s.toCharArray())
            {
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            int odds = 0;
            for(char key:map.keySet())
            {
                if(map.get(key)%2 ==1) odds++;
            }
            System.out.println(odds<=k+1 ? "YES" : "NO");
        }
        sc.close();
    }
}

