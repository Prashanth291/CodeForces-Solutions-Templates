import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AboveTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            // int i = 1, j = 2;
            boolean flag = false;
            Map<Character,Integer> map = new HashMap<>();
            for(char ch:s.toCharArray())
            {
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
            for(char key:map.keySet())
            {
                if(map.get(key) == 2)
                {
                    if(s.charAt(0) == key && key == s.charAt(n-1)) flag = false;
                    else{
                         flag = true;
                         break;
                    }
                }
                else if(map.get(key) >2)
                {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}


/*
 * InputCopy
12
3
aaa
3
aba
3
aab
4
abca
4
abba
4
aabb
5
abaca
5
abcda
5
abcba
6
abcbbf
6
abcdaa
3
abb
OutputCopy
Yes
No
Yes
No
Yes
Yes
Yes
No
Yes
Yes
Yes
Yes
 */