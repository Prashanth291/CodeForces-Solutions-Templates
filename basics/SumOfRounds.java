import java.util.Scanner;
import java.util.Stack;

public class SumOfRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int den = 10;
            while(n != 0)
            {
                int rem = n % den;
                n -= rem;
                den *= 10;
                if(rem != 0) st.push(rem);
            }
            System.out.println(st.size());
            while(!st.isEmpty())
            System.out.print(st.pop()+" ");
            System.out.println();
        }
        sc.close();
    }
}
