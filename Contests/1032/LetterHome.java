import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt(), pos = sc.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
            if(pos>=nums[n-1])
            {
                System.out.println(pos-nums[0]);
            }
            else if(pos<=nums[0])
            {
                System.out.println(nums[n-1] - pos);
            }
            else
            {
                int res = Math.min(2*(pos-nums[0])+(nums[n-1]-pos),2*(nums[n-1]-pos)+(pos-nums[0]));
                System.out.println(res);
            }
        }
    }
}


/*
 * InputCopy
12
1 1
1
1 2
1
1 1
2
2 1
2 3
2 2
1 3
2 3
1 2
3 1
1 2 3
3 2
1 3 4
3 3
1 2 3
4 3
1 2 3 10
5 5
1 2 3 6 7
6 6
1 2 3 9 10 11
OutputCopy
0
1
1
2
3
2
2
4
2
11
8
15
 */