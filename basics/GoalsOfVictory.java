import java.util.Scanner;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n-1];
            for(int i=0;i<n-1;i++)
            a[i] = sc.nextInt();
            int s = 0;
            for(int num:a) s+=num;
            System.out.println(-s);
        }
        sc.close();
    }
}
/*
 * 2
4
3 -4 5
11
-30 12 -57 7 0 -81 -68 41 -89 0

 */