import java.util.Scanner;
public class friends{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int centroid = (x1 + x2 + x3)/3;
        int ans = 0;
        ans += Math.abs(x1 - centroid);
        ans += Math.abs(x2 - centroid);
        ans += Math.abs(x3 - centroid);
        System.out.println(ans);
        sc.close();
    }
}