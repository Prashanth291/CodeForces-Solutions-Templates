import java.util.Scanner;

public class Relaition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            int[] nums = new int[n];
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                nums[i] = sc.nextInt();
            }
            
            int root2 = (2*nums[0] - nums[1]) /(n+1);
            int root1 = nums[0] - n*root2;
            if(root1<0 || root2<0)
            {
                System.out.println("NO");
                continue;
            }
            for(int i=0;i<n;i++)
            {
                int res = root1 * (i+1) + root2 * (n-i);
                if(res != nums[i])
                {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }
}


/*
 * 6
4
3 6 6 3
5
21 18 15 12 9
10
2 6 10 2 5 5 1 2 4 10
7
10 2 16 12 8 20 4
2
52 101
2
10 2

 */