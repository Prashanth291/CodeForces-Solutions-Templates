import java.util.Arrays;
import java.util.Scanner;

public class puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        nums[i] = sc.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[m-1]-nums[0]);
        sc.close();
    }
}
