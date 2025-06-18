import java.util.Scanner;
import java.util.Stack;

public class AC {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    Stack<Character> st = new Stack<>();
    for(char ch:s.toCharArray())
    {
        if(st.isEmpty() || st.peek()!=ch) st.push(ch);
        else st.pop();
    }
    System.out.println(s.isEmpty() ? "YES" : "NO");
   } 
}
