// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Triangle {
    public static boolean checkTriangle(int a,int b,int c)
    {
         if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int[] arr = new int[4];
            for(int i=0;i<4;i++)
            arr[i] = sc.nextInt();
            boolean found = false;
            for(int i=arr[0];i<=arr[1] && !found;i++)
            {
                for(int j = arr[2];j>=arr[1] && !found;j--)
                {
                    for(int k = arr[3];k>=arr[2];k--)
                    {
                        if(checkTriangle(i,j,k))
                        {
                            found = true;
                            System.out.println(i+" "+j+" "+k);
                            break;
                        }
                    }
                }
            }
        }
    }
}