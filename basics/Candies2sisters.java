import java.util.Scanner;

public class Candies2sisters {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            System.out.println((n&1)==1 ? (int)n/2 : (int)n/2-1);
        }
        sc.close();
    }
}
