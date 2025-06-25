import java.util.Scanner;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt(),b = sc.nextInt();
            int diff = Math.abs(a-b);
            int max = Math.max(a,b), min = Math.min(a,b);
            int steps = max/min;
            System.out.println(diff+" "+steps);
        }
    }
    public static int gcd(int a,int b)
    {
        if(a<0 || b<0) return (int)1e6;
        while(b != 0)
        {
            b = a%b;
            a = b;
        }
        return a;
    }
}
