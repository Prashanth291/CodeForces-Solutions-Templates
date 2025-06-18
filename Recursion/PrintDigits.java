import java.util.Scanner;

public class PrintDigits {
    public static void rec(long n)
    {
        if(n==0) return;
        
        rec(n/10);
        System.out.print(n%10+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextInt();
            rec(n);
            System.out.println();
        }
        sc.close();
    }
}
