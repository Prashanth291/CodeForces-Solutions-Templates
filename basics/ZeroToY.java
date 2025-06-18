import java.util.Scanner;
public class ZeroToY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y =sc.nextInt();
            int steps = 0;
            int[] pow = new int[10];
            pow[0] = 1;
            for(int i=1;i<10;i++)
            pow[i] = pow[i-1] * 10; //2,7
            while(y!=0)
            {
              steps++;
              if(y>x)
              {
                System.out.println(y);
                for(int i=9;i>=0;i--)
                {
                    System.out.println(y+" "+(x*pow[i]));
                    if(y>(x*pow[i]))
                    {
                        y -= (x*pow[i]);
                        break;
                    }
                }
                System.out.println(y);
              }
              else{
                y--;
              }
            }
            System.out.println(steps);
        }
        sc.close();
    }
}
