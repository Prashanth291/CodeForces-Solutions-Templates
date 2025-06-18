import java.util.Scanner;

public class Kefa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int maxStreak = 1;
        int currStreak = 1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>=a[i-1])
            {
                currStreak++;
            }
            else{
                maxStreak = Math.max(currStreak,maxStreak);
                currStreak=1;
            }
            // System.out.println(currStreak+"  "+maxStreak);
        }
        maxStreak = Math.max(currStreak,maxStreak);
        System.out.println(maxStreak);
    }
}
