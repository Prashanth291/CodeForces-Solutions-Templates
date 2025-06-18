import java.util.Arrays;
import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int str = sc.nextInt();
         int n = sc.nextInt();
         int[][] ds = new int[n][2];
         boolean flag = true;
         for(int i=0;i<n;i++)
         {
            ds[i][0] = sc.nextInt();
            ds[i][1] = sc.nextInt();
            sc.nextLine();
         }
         Arrays.sort(ds,(a,b)->Integer.compare(a[0],b[0]));
         for(int i=0;i<n;i++)
         {
            if(ds[i][0]>=str)
            {
                flag = false;
                break;
            }
            else{
                str += ds[i][1];
            }
         }
         System.out.println(flag ? "YES" : "NO");
    }
}
