import java.util.Scanner;

public class D1709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++)
            {
                b[i] = sc.nextInt();
            }
            int[]
        }        
    }
    private static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static void swapBtw(int[] a,int[] b,int i)
    {
        int temp = a[i];
        a[i] = b[i];
        b[i] = temp;
    }
}
