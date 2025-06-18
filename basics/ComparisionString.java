import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ComparisionString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] nums = new int[n+1];
        nums[0] = s.charAt(0)=='>' ? n+1 : 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            nums[i+1] = s.charAt(i) == '>' ? nums[i] - 1 : nums[i]+1;
        }
        for(int num:nums)
        System.out.print(num+" ");
        for(int num:nums) set.add(num);
        System.out.println(set.size());
    }
   } 
}

/*
 * 
 * 4
4
<<>>
4
>><<
5
>>>>>
7
<><><><
OutputCopy
3
3
6
2
 */

 /*
  * 7
>><>><>
7
><>><>>
  */