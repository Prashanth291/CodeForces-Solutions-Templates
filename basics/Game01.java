import java.util.Scanner;
import java.util.Stack;

public class Game01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            int pairs = 0;
            for(char ch:s.toCharArray())
            {
                if(st.isEmpty() || st.peek() == ch)
                {
                    st.push(ch);
                }
                else if(st.peek() != ch)
                {
                    st.pop();
                    pairs++;
                }
            }
            System.out.println(pairs%2 == 0 ? "NET" : "DA");
        }
    }
}
