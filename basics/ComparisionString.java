import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


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
        nums[0] = n;
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(n);
        for(int i=0;i<n;i++)
        {
          if(s.charAt(i) == '<')
          {
            int search = searchGreater(set,nums[i]);
            if(search == -1)
            {
              nums[i+1] = nums[i]+1;
              set.add(nums[i]+1);
            }
            else{
              nums[i+1] = search;
            }
          }
          else{
            int search = SearchLower(set,nums[i]);
            if(search == -1)
            {
              nums[i+1] = nums[i]-1;
              set.add(nums[i]-1);
            }
            else{
              nums[i+1] = search;
            }
          }
        }
        
        System.out.println(set);
        System.out.println(set.size());
    }
   } 
   private static int searchGreater(TreeSet<Integer> set, int key) {
    Integer result = set.higher(key);
    return result != null ? result : -1;
}

   private static int SearchLower(TreeSet<Integer> set,int key)
   {
      for(int num:set){
        if(num<key) return num;
      }
      return -1;
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