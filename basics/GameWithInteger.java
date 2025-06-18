import java.util.Scanner;

public class GameWithInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt();
            System.out.println(n%3==0 ? "Second" : "First");
        }
    }
}
/*
 * 6
1
3
5
100
999
1000

 */