import java.util.Scanner;
import java.util.HashSet;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        set.add(s.charAt(i));

        if(set.size()%2==0)
        System.out.println("CHAT WITH HER!");
        else 
        System.out.println("IGNORE HIM!");
        sc.close();
    }
}