import java.util.Scanner;

public class Shrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] ans = new int[n];
            ans[0] = 1;
            ans[n-1] = 2;
            for(int i = 1;i<n-1;i++)
            ans[i] = i+2;

            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
