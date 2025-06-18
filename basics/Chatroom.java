import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,List<Integer>> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.get(ch).add(i);
            }
            else{
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(ch,l);
            }
        }
        boolean flag = true;
        int prev = -1;
        String req = "hello";
        int dummy;
        for(int i=0;i<5;i++)
        {
            char ch = req.charAt(i);
            dummy = prev;
            if(!map.containsKey(ch))
            {
                flag = false;
                break;
            }
            else
            {
                List<Integer> search = map.get(ch);
                
                for(int j=0;j<search.size();j++)
                {
                    if(search.get(j)>prev)
                    {
                        prev = search.get(j);
                        break;
                    }
                }
            }
            if(prev == dummy) 
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
