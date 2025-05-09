// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.HashMap;
public class Sushi {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        if(arr[i] == 2) arr[i] = -1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            // int comp = -1 * sum;
            if(sum == 0)
            maxLen = i + 1;
            if(map.containsKey(sum))
            {
                int len = i - map.get(sum);
                maxLen = Math.max(len,maxLen);
            }
            else map.put(sum,i);
        }
        System.out.println(maxLen);
        sc.close();
    }
}