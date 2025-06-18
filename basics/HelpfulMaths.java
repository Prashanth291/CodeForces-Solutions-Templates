import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Queue<Character> q = new LinkedList();
        List<Character> l = new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if(ch != '+') l.add(ch);
        }
        Collections.sort(l);
        // System.out.println(l);
        for(int i=0;i<l.size();i++)
        {
            if(i<l.size()-1)
            {
                System.out.print(l.get(i));
                System.out.print('+');
            }
            else System.out.print(l.get(i));
        }
        sc.close();
    }
}
