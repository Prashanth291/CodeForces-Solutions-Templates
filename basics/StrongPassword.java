import java.util.Scanner;

public class StrongPassword {
    public static int typingTime(String s) {
        int time = 2; // First character always takes 2 sec
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                time += 1;
            else
                time += 2;
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String best = "";
            int maxTime = -1;

            for (int i = 0; i <= s.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    String candidate = s.substring(0, i) + c + s.substring(i);
                    int time = typingTime(candidate);
                    if (time > maxTime) {
                        maxTime = time;
                        best = candidate;
                    }
                }
            }
            System.out.println(best);
        }
        sc.close();
    }
}
