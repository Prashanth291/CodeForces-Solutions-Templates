import java.util.Scanner;
// Solving After Contest
public class A{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt(),k = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                System.out.print(i<k ? '1' : '0');
            }
            System.out.println();
        }
    }
}