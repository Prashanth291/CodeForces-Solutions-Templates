import java.util.Scanner;

public class YoungPhysist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b=0,c=0;
        while(n-->0)
        {
            a+=sc.nextInt();
            b+=sc.nextInt();
            b+=sc.nextInt();
            sc.nextLine();
        }
        System.out.println((a==0 && b==0 && c==0) ? "YES" : "NO");
    }
}
