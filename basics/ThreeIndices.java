import java.util.Scanner;
import java.util.Stack;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i =0;i<n;i++)
            nums[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int[] nse = nextSmallerElement(nums,st);
            st.clear();
            int[] pse = previousSmallerElement(nums,st);
            boolean flag = false;
            int[] ans = new int[3];
            for(int i = 0;i<n;i++)
            {
                if(nse[i] != -1 && pse[i] != -1)
                {
                    flag = true;
                    ans[0] = pse[i];
                    ans[1] = i+1;
                    ans[2] = nse[i];
                    break;
                }
            }
            if(!flag)
            {
                System.out.print("NO");
            }
            else{
                System.out.println("YES");
                for(int i=0;i<3;i++)
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
    private static int[] nextSmallerElement(int[] nums,Stack<Integer> st){
        int n = nums.length;
        int[] nse = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[st.peek()-1] >= nums[i]) st.pop();
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i+1);
        }
        // System.out.println("NSE:");
        // for(int num:nse)
        // System.out.print(num);
        return nse;
    }
     private static int[] previousSmallerElement(int[] nums,Stack<Integer> st){
        int n = nums.length;
        int[] pse = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && nums[st.peek()-1] >= nums[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i+1);
        }
        // System.out.println("PSE:");
        // for(int num:pse)
        // System.out.print(num+"  ");
        return pse;
    }

}
/*
 * 
 * 3
4
2 1 4 3
6
4 6 1 2 5 3
5
5 3 1 2 4


YES
2 3 4
YES
3 5 6
NO

 */