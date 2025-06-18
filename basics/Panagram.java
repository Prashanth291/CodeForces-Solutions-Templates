import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        // String s = "TheQuickBrownFoxJumpsOverTheLazyDog";
        s = s.toLowerCase();
        // System.out.println(s);
        HashSet<Character> set = new HashSet<>();
        for(char ch:s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
            }
        }
        // System.out.println(set+" "+set.size());
        System.out.println(set.size()==26?"YES" : "NO");
    }
}
