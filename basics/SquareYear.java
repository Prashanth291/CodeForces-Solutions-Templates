import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SquareYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Deque<Character> dq = new ArrayDeque<>();
            for (char ch : s.toCharArray()) {
                if (dq.isEmpty() && ch == '0') continue;
                dq.offerLast(ch);
            }
            StringBuilder sb = new StringBuilder();
            while (!dq.isEmpty()) sb.append(dq.pollFirst());
            s = sb.toString();

            if (s.isEmpty()) {
                System.out.println(-1);
                continue;
            }

            long n = Long.parseLong(s);
            long sqrt = (long)Math.sqrt(n);
            if (sqrt * sqrt == n) {
                System.out.println("1 " + (sqrt - 1));
            } else {
                System.out.println(-1);
            }
        }
    }
}
