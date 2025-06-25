
import java.util.Scanner;

public class SquareOfRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int l1 = sc.nextInt(), b1 = sc.nextInt(), l2 = sc.nextInt(), b2 = sc.nextInt(),l3 = sc.nextInt(), b3 = sc.nextInt();
            long sum = (l1*b1)+(l2*b2)+(l3*b3);
            double sqrt = Math.sqrt(sum) - (int)Math.sqrt(sum);
            // System.out.println(sum+" "+sqrt);
            // System.out.println(sqrt == 0 ? "YES" : "NO");
            boolean flag = false;
            // placed side by side
            if(sqrt == 0)
            {
                int min = Math.min(b2,b3);
                int hor = l2 + l3;
                flag = (min*hor == l2*b2 + l3*b3 && hor == l1);
                if(!flag)
                {
                    min = Math.min(l2,l3);
                    int ver = b2+b3;
                    flag =( min * ver == l2*b2 + l3*b3 && min == b1);
                }
            }
            System.out.println((sqrt == 0 && flag) ? "YES" : "NO");

        }
    }
}
