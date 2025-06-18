import java.util.Scanner;

public class B {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n  = sc.nextInt();
            System.out.println(2*(n-1));
            for(int i=1;i<=n;i++)
            {
                if(i==1)
                {
                    System.out.println(1+" "+2+" "+n);
                }
                else if(i<n)
                {
                    System.out.println(i+" "+1+" "+i);
                    System.out.println(i+" "+(i+1)+" "+n);
                }
                else{
                    System.out.println(n+" "+1+" "+n);
                }
            }
        }
    }
}
