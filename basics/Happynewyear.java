// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.Scanner;
import java.util.Scanner;
public class Happynewyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int avail = 240 - k;
        int[] time = new int[n];
        time[0] = 5;
        for (int i = 1; i < n; i++) {
            time[i] = (i + 1) * 5 + time[i - 1];
        }
        int low = 0, high = n-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            if(avail<time[mid]) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(low);
        sc.close();
    }
}