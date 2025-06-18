import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] heights = new int[n];
        for(int i=0;i<n;i++)
        {
            heights[i] = sc.nextInt();
        }
        int minIdx = 0,windowSum = 0;
        for(int i=0;i<k;i++)
        {
            windowSum += heights[i];
        }
        int minSum = windowSum;
        for(int i = 1;i<n-k+1;i++)
        {
            windowSum -= heights[i-1];
            windowSum += heights[i+k-1];
            if(windowSum<minSum)
            {
                minSum = windowSum;
                minIdx = i;
            }
        }
        System.out.println(minIdx+1);
    }
}
