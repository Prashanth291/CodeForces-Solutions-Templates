import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int nani =0;
        for(int num:arr) nani += num;
        int vinay = 0;
        int i = 0;
        for(i=0;i<n;i++)
        {
            vinay += arr[i];
            nani -= arr[i];
            if(vinay>nani)
            {
                System.out.println(i+1);
                break;
            }
        }

    }
}
