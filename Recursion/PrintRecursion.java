import java.util.Scanner;

public class PrintRecursion
{
    private static void rec(int n)
    {
        if(n==0) return;
        System.out.println("I love Recursion");
        rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(n);
        sc.close();
    }
}