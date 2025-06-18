import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxStreak = 0;
        int currStreak = 1;
        for(int i=1;i<s.length();i++)
        {
            if(maxStreak>=7) break;
            if(s.charAt(i) == s.charAt(i-1))
            {
                currStreak++;
            }
            else{
                maxStreak = Math.max(maxStreak,currStreak);
                currStreak=1;
            }
        }
        maxStreak = Math.max(maxStreak,currStreak);
        // System.out.println(maxStreak);
        System.out.println(maxStreak>=7 ? "YES" : "NO");
    }
}
// 11110111111111111
