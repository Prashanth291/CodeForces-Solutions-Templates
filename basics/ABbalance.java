
import java.util.Scanner;
import java.util.Stack;

public class ABbalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int n = s.length();
            Stack<Character> st = new Stack<>();
            char[] arr = s.toCharArray();
            int ab = 0, ba = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(!st.isEmpty() && st.peek()=='b' && arr[i]=='a') ba++;
                else if(!st.isEmpty() && st.peek() == 'a' && arr[i] == 'b') ab++;
                st.push(arr[i]);
            }
            String ans = s;
            if(ab > ba)
            {
                if(s.startsWith("ab"))
                {
                    arr[0] = 'b';
                    ans =  String.valueOf(arr);
                    // System.out.println("1if");
                }
                else if(s.endsWith("ab"))
                {
                    arr[n-1] = 'a';
                    ans =  String.valueOf(arr);
                    // System.out.println("3if");
                }
                else if(s.endsWith("bb"))
                {
                    arr[n-1] = 'a';
                    ans =  String.valueOf(arr);
                    // System.out.println("4if");
                }
            }
            else if(ab < ba)
            {
                if(s.startsWith("ba"))
                {
                    arr[0] = 'a';
                    ans =  String.valueOf(arr);
                }
                else if(s.endsWith("ba"))
                {
                    arr[n-1] = 'b';
                     ans =  String.valueOf(arr);
                }
                else if(s.endsWith("aa"))
                {
                    arr[n-1] = 'b';
                    ans =  String.valueOf(arr);
                }
                
            }
            System.out.println(ans);
            
        }
    }
    // private static int rec(int i,char[] arr)
    // {
    //     if(i == arr.length)
    //     {
    //         return Counter(arr) ? 0 : (int)1e6;
    //     }
    //     int pick = 0, dont = 0;
    //     if(arr[i] == 'a')
    //     {
    //         arr[i] = 'b';
    //         pick = rec(i+1,arr) + 1;
    //         arr[i] = 'a';
    //     }
    //     else{
    //         arr[i] = 'a';
    //         pick = rec(i+1,arr) + 1;
    //         arr[i] = 'b';
    //     }
    //     dont = rec(i+1,arr);
    //     return Math.min(pick,dont);
    // }
    
}
